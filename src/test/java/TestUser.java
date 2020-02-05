import java.util.ArrayList;
import java.util.List;


import fr.eni.jpa.dal.CiviliteDAO;
import fr.eni.jpa.dal.DAOOutil;
import fr.eni.jpa.dal.PersonneDAO;
import fr.eni.jpa.entity.Civilite;
import fr.eni.jpa.entity.User;

public class TestUser {

	public static void main(String[] args) {
		PersonneDAO pdao = new PersonneDAO();
		CiviliteDAO cdao = new CiviliteDAO();

		Civilite m, mme;

		try {
			m = cdao.findById("M");
			mme = cdao.findById("Mme");

			System.out.println(m);
			System.out.println(mme);

			User p1 = new User("Leblond", "Annie", mme);
			User p2 = new User("Lebrun", "Sophie", mme);
			User p3 = new User("Lechauve", "Marcel", m);
			User p4 = new User("Leblond", "Yann", m);
			User p5 = new User("Hervé", "Yoann", m);

			pdao.add(p1);
			pdao.add(p2);
			pdao.add(p3);
			pdao.add(p4);
			pdao.add(p5);

			List<User> listeU = pdao.findAll();
			System.out.println(listeU);

			System.out.println("Suppression de toutes les femmes : ");
			pdao.delete(p1);
			pdao.delete(p2);

			listeU = pdao.findAll();
			System.out.println(listeU);

			System.out.println("Liste des civilités : ");
			List<Civilite> listeC = cdao.findAll();
			System.out.println(listeC);

		} catch (Exception e) {
			e.printStackTrace();
		}

		DAOOutil.close();
	}

}