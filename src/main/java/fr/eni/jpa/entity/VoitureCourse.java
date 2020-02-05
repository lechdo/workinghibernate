package fr.eni.jpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name= "table_per_class_VoitureCourse")
public class VoitureCourse extends Voiture {

	private String ecurie;

	public VoitureCourse() {
	}

	public VoitureCourse(String marque, String ecurie) {
		super(marque);
		this.ecurie = ecurie;
	}

	public String getEcurie() {
		return ecurie;
	}

	public void setEcurie(String ecurie) {
		this.ecurie = ecurie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VoitureCourse [ecurie=");
		builder.append(ecurie);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
