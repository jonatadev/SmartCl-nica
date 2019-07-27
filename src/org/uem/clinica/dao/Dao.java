package org.uem.clinica.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;


public class Dao {
      private static EntityManagerFactory factory = 
              Persistence.createEntityManagerFactory("sample");
      private static EntityManager entityManager = 
              factory.createEntityManager();
      
      public static void Inserir(Object entidade) {
            entityManager.getTransaction().begin();
            entityManager.persist(entidade);
            entityManager.getTransaction().commit();
            entityManager.close();
            factory.close();
      } 
      // 
      public void search() {
            String hql  = "From Paciente AS P";
            Query query  = entityManager.createQuery(hql);
            List result = query.getResultList();
      }
}

// https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-jpa-dao-example/
// https://www.devmedia.com.br/jpa-e-hibernate-acessando-dados-em-aplicacoes-java/32711
// https://www.baeldung.com/java-dao-pattern

// http://www.universidadejava.com.br/materiais/jpa-exemplo-crud/