package entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_verbrauch")
public class Verbrauch implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 8910547784460812467L;
    
    
    @Id
    @GeneratedValue
    private int id_verbrauch;
    private double zaehlerstand;    
    private Date datum;   
    @OneToOne
    private User user;
    
    private Adresse adresse;
    private Energietyp engergietyp;
    
    public Verbrauch(){
	
    }

}
