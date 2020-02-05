package fr.eni.jpa.main;

import java.util.List;

import fr.eni.jpa.dal.DaoUtil;
import fr.eni.jpa.dal.VoitureDAO;
import fr.eni.jpa.entity.Berline;
import fr.eni.jpa.entity.Voiture;
import fr.eni.jpa.entity.VoitureCourse;

public class TestVoiture {

	public static void main(String[] args) {

		Voiture v1 = new Voiture("Renault Clio");
		Berline b1 = new Berline("BMW", "Rouge");
		VoitureCourse c1 = new VoitureCourse("Ferrari", "Scuderia Ferrari");

		VoitureDAO vdao = new VoitureDAO();

		try {
			vdao.add(v1);
			vdao.add(c1);
			vdao.add(b1);

			List<Voiture> allCars = vdao.findAll();
			System.out.println("Toutes les voitures en base");
			System.out.println(allCars);

			System.out.println("Les Berlines : ");
			List<Voiture> berlines = vdao.findBerlines();
			System.out.println(berlines);

			System.out.println("Les voitures de course : ");
			List<Voiture> voituresCourse = vdao.findVoituresCourse();
			System.out.println(voituresCourse);

		} catch (Exception e) {
			e.printStackTrace();
		}

		DaoUtil.close();
	}

}
