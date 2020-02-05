package fr.eni.jpa.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.jpa.entity.Civilite;

public class CiviliteDAO {

	public void add(Civilite civilite) throws Exception {
		EntityManager em = DAOOutil.getEm();
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.persist(civilite);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw e;
		}
	}

	public void update(Civilite civilite) throws Exception {
		EntityManager em = DAOOutil.getEm();
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.merge(civilite);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw e;
		}
	}

	public void delete(Civilite civilite) throws Exception {
		EntityManager em = DAOOutil.getEm();
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.remove(civilite);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw e;
		}
	}

	public Civilite findById(String cle) {
		return DAOOutil.getEm().find(Civilite.class, cle);
	}

	public List<Civilite> findAll() {
		// 'select' non obligatoire, info dev pour insister sur le fait qu'on retourne
		// un object java
		String request = "select Object(c) from Civilite c";
		return DAOOutil.getEm().createQuery(request, Civilite.class).getResultList();
	}
}
