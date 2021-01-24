package br.com.datainfo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.datainfo.entidades.Usuario;

public class JpaDao {

    private EntityManager getEM() {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        try {
            emf = Persistence.createEntityManagerFactory("persistence");
            em = emf.createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return em;
    }

    public void salvar(Usuario usuario) {
        EntityManager em = null;
        try {
            em = getEM();
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

    }
    
    public void atualizar(Usuario usuario) {
        EntityManager em = null;
        try {
            em = getEM();
            em.getTransaction().begin();
            em.merge(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

    }

    public List<Usuario> listar(String parametro) {
        EntityManager em = null;
        List<Usuario> lista = null;
        try {
            em = getEM();
            em.getTransaction().begin();
            Query query = em.createQuery(parametro);
            lista = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return lista;
    }

    public  Usuario listarId(Long id) {
        EntityManager em = null;
       Usuario usuario = null;
        try {
            em = getEM();
            em.getTransaction().begin();
            usuario = em.find(Usuario.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return usuario;
    }
    
    public void deletar(Usuario usuario) {
        EntityManager em = null;
        try {
            em = getEM();
            em.getTransaction().begin();
           em.remove(em.getReference(Usuario.class, usuario.getId()));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}
