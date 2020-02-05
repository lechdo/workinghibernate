package fr.eni.jpa.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.jpa.entity.Voiture;

public class VoitureDAO {

	public void add(Voiture voiture) throws Exception {
		EntityManager em = DaoUtil.getEm();
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.persist(voiture);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw e;
		}
	}

	public void update(Voiture voiture) throws Exception {
		EntityManager em = DaoUtil.getEm();
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.merge(voiture);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw e;
		}
	}

	public void delete(Voiture voiture) throws Exception {
		EntityManager em = DaoUtil.getEm();
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.remove(voiture);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw e;
		}
	}

	public Voiture findById(int id) {
		return DaoUtil.getEm().find(Voiture.class, id);
	}
	
	public List<Voiture> findAll() {
		// select non obligatoire, info dev pour insister sur le fait qu'on retourne un object java
		String request = "select Object(u) from Voiture u";
		return DaoUtil.getEm().createQuery(request, Voiture.class).getResultList();
	}
	
	public List<Voiture> findBerlines() {
		String request = "select Object(u) from Berline u";
		return DaoUtil.getEm().createQuery(request, Voiture.class).getResultList();
	}
	
	public List<Voiture> findVoituresCourse() {
		String request = "select Object(u) from VoitureCourse u";
		return DaoUtil.getEm().createQuery(request, Voiture.class).getResultList();
	}
	
}
