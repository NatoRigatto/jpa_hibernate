package aula_01.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aula_01.model.entities.Person;

public class Program {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		/*
		INSERIR objetos no Banco de Dados
		 
		Person p1 = new Person(null, "Robson Rigatto", "robsonrigatto@gmail.com");
		Person p2 = new Person(null, "Renato Rigatto", "renatorigatto@gmail.com");
		Person p3 = new Person(null, "Rafael Rigatto", "rafaelrigatto@gmail.com");
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();
		*/

		/*
		BUSCAR um objeto pelo Id
		
		Person p = em.find(Person.class, 2);
		
		System.out.println(p);
		*/

		/*
		DELETAR um objeto pelo Id
		
		Person p = em.find(Person.class, 2);
		 
		em.getTransaction().begin();
		
		em.remove(p);
		
		em.getTransaction().commit();
		*/

		System.out.println("Pronto!");

		em.close();
		emf.close();

	}

}
