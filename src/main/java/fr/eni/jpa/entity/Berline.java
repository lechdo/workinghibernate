package fr.eni.jpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("B")
public class Berline extends Voiture {
	
	private String color;
	
	

	public Berline() {
		// TODO Auto-generated constructor stub
	}

	public Berline(String marque, String color) {
		super(marque);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Berline [color=");
		builder.append(color);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	






	
	
}
