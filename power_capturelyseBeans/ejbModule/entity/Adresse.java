package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="adresse")
public class Adresse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8411139256289721253L;
	
	@Id
	@GeneratedValue
	private int id_adresse;
	private String strasse;
	private int plz;
	private String ort;
	
	
	private User user;


	public int getId_adresse() {
		return id_adresse;
	}


	public void setId_adresse(int id_adresse) {
		this.id_adresse = id_adresse;
	}


	public String getStrasse() {
		return strasse;
	}


	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}


	public int getPlz() {
		return plz;
	}


	public void setPlz(int plz) {
		this.plz = plz;
	}


	public String getOrt() {
		return ort;
	}


	public void setOrt(String ort) {
		this.ort = ort;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	public Adresse(){
		
	}
	
	

}
