package com.hibernates.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonData {
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Takshil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Pan p = entityManager.find(Pan.class,11 );
	System.out.println(p);
	
	
	}
	
}
