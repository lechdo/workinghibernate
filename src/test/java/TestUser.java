import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.eni.jpa.dal.PersonneDAO;
import fr.eni.jpa.entity.User;

public class TestUser {

	
	public static void main(String[] args) {
		
		List<String> listeSport1 = new ArrayList<>();
		listeSport1.add("Athlétisme");
		listeSport1.add("Judo");
		listeSport1.add("Hand-Ball");
		User u1 = new User("Annie", "Leblond", listeSport1);
		
		List<String> listeSport2 = new ArrayList<>();
		listeSport2.add("Savate");
		listeSport2.add("Canoe_kayak");
		listeSport2.add("Tir-a-l'arc");
		listeSport2.add("Judo");
		User u2 = new User("Anne", "B", listeSport2);
		
		PersonneDAO pdao = new PersonneDAO();
		
		try {
			pdao.add(u1);
			pdao.add(u2);
			
			List<User> liste = pdao.findAll();
			System.out.println("Liste des personnes  : ");
			System.out.println(liste);
			
			pdao.delete(u2);
			liste = pdao.findAll();
			System.out.println("Liste des personnes près suppression: ");
			System.out.println(liste);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
