package com.hibernates.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonPanMain {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Takshil");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Pan pan = new Pan();
		pan.setId(11);
		pan.setPan_no("abcxy345z");
		pan.setFather_name("bhaskar");
		
		Person person = new Person();
		person.setId(1);
		person.setName("suraj");
		person.setAge(22);
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();

	}

}
