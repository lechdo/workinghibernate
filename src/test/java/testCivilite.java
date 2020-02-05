import fr.eni.jpa.dal.CiviliteDAO;
import fr.eni.jpa.entity.Civilite;

public class testCivilite {

	public static void main(String[] args) {

		Civilite m = new Civilite("M", "Monsieur");
		Civilite mme = new Civilite("Mme", "Madame");
		CiviliteDAO cdao = new CiviliteDAO();
		
		try {
			cdao.add(m);
			cdao.add(mme);
		} catch (Exception e) {
e.printStackTrace();
		}
		
	System.out.println("Les civilités en base ");
	System.out.println(cdao.findAll());	
	
		
	}

}
