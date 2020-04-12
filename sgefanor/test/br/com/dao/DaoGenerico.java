package br.com.dao;

import br.com.javautil.JPAUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class DaoGenerico <E> {
    
    public void salvar(E entidade){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction ts = em.getTransaction();
        ts.begin();
        
        em.persist(entidade);
        ts.commit();
        em.close();
        
    }
    
    public E merge(E entidade){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction ts = em.getTransaction();
        ts.begin();
        
        E ent = em.merge(entidade);
        ts.commit();
        em.close();
        
        return ent;
    }
    
     public void deletar(E entidade){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction ts = em.getTransaction();
        ts.begin();
        
        em.remove(entidade);
        ts.commit();
        em.close();
        
    }
    
}
