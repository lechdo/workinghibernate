package fr.eni.jpa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name= "user_collection")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String login;
	private String password;

	@ElementCollection
	@CollectionTable(name = "SPORT", joinColumns = @JoinColumn(name = "id_sp", referencedColumnName = "id"))
	@Column(name = "sport")
	List<String> sports;

	public User() {
		super();
	}

	public User(String login, String password, List<String> sports) {
		super();
		this.login = login;
		this.password = password;
		this.sports = sports;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getSports() {
		return sports;
	}

	public void setSports(List<String> sports) {
		this.sports = sports;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append(", sports=");
		builder.append(sports);
		builder.append("]");
		return builder.toString();
	}

}
