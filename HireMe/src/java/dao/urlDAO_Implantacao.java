package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.url;

public class urlDAO_Implantacao implements urlDAO{

//	@Inject
//	EntityManager entityManager;
//	
//	public url retrieve(Long id) {
//		url finded = entityManager.find(url.class, id);
//		entityManager.close();
//		return finded;
//	}
//
//	public url create(url url) {
//		entityManager.getTransaction().begin();    
//		entityManager.persist(url);
//		entityManager.getTransaction().commit();  
//	
//		entityManager.close();
//		
//		return url;
//	}
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("hireme");
	
	public url retrieve(Long id) {
		EntityManager manager = factory.createEntityManager();
		url finded = manager.find(url.class, id);
		manager.close();
		return finded;
	}

	public url create(url url) {
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();    
		manager.persist(url);
		manager.getTransaction().commit();  
	
		manager.close();
		
		return url;
	}

}