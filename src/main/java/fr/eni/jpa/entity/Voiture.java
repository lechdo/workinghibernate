package fr.eni.jpa.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Table_per_class_Voiture")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Voiture implements Serializable {

	@Id
	// type de génération des ids
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;

	private String marque;

	public Voiture() {
		super();
	}

	public Voiture(String marque) {
		super();
		this.marque = marque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Voiture [id=");
		builder.append(id);
		builder.append(", marque=");
		builder.append(marque);
		builder.append("]");
		return builder.toString();
	}

}
