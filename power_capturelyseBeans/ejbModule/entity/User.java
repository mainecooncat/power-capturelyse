package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="tb_user")
//@SecondaryTable(name="tb_adresse")
public class User implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -3617527092249858891L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_user;
    @Column(nullable=false, length=45) private String username;
    @Column(nullable=false, length=45) private String uservname;
    @Column(nullable=false, length=45) private String password;
    
    //Adresse
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "id_user")
    private List<Adresse> adresse;
    
    //oder so
//    private String strasse;
//    private String ort; 
//    private int plz;
//    
//    @Column(name="strasse", table="tb_adresse")
//    public String getStrasse() {
//        return strasse;
//    }
//
//    public void setStrasse(String strasse) {
//        this.strasse = strasse;
//    }
//
//    @Column(name="ort", table="tb_adresse")
//    public String getOrt() {
//        return ort;
//    }
//
//    public void setOrt(String ort) {
//        this.ort = ort;
//    }
//
//    @Column(name="plz", table="tb_adresse")
//    public int getPlz() {
//        return plz;
//    }
//
//    public void setPlz(int plz) {
//        this.plz = plz;
//    }
    
    
    
    

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getUservname() {
        return uservname;
    }

    public void setUservname(String uservname) {
        this.uservname = uservname;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String getPassword()
    {
    	return password;
    }
    
       
    public List<Adresse> getAdresse(){
	return adresse;
    }
    
    public void setAdresse(List<Adresse> adresse){
	this.adresse = adresse;
    }
    
    
    public User(){
	
    }
    
    
	

}
