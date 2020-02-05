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
@Table(name = "SingleVoiture")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DISCR")
@DiscriminatorValue("V")
public class Voiture implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
