package fr.eni.jpa.dal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoUtil {
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	static {
		emf = Persistence.createEntityManagerFactory("Mysql_UP");
		em = emf.createEntityManager();
		
	}

	public static EntityManager getEm() {
		return em;
	}

	
	public static void close() {
		if (em != null) {
			em.close();
		} 
		if (emf != null){
			emf.close();
		}
	}

	
	
	
}
