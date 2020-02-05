package fr.eni.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CIVILITE_M2O")
public class Civilite {

	@Id
	private String cle;
	private String libelle;
	

	public Civilite(String cle, String libelle) {
		super();
		this.cle = cle;
		this.libelle = libelle;
	}

	public Civilite() {
		super();
	}

	public String getCle() {
		return cle;
	}

	public void setCle(String cle) {
		this.cle = cle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Civilite [cle=");
		builder.append(cle);
		builder.append(", libelle=");
		builder.append(libelle);
		builder.append("]");
		return builder.toString();
	}

}
