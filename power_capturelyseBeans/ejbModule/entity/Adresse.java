package entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tb_adresse")
public class Adresse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8411139256289721253L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_adresse;
	@Column(nullable=false, length=45) private String strasse;
	@Column(nullable=false) private int plz;
	@Column(nullable=false, length=45) private String ort;
	
	
	@Column(nullable=false, columnDefinition="INTEGER(11)") private User id_user;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "id_adresse")
	private Set<Verbrauch> verbrauch;


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

	@ManyToOne
	@JoinTable(name="tb_user", joinColumns={
		@JoinColumn(name="id_user", referencedColumnName="id_user")
		}
	)
	@Column(nullable=false, columnDefinition="INTEGER(11)")
	public User getId_User() {
		return id_user;
	}


	public void setId_User(User id_user) {
		this.id_user = id_user;
	}
	
		
	public Set<Verbrauch> getVerbrauch(){
	    return verbrauch;
	}
	
	public void setVerbrauch(Set<Verbrauch> verbrauch){
	    this.verbrauch = verbrauch;
	    
	}
	
	public Adresse(){
		
	}
	
	

}
