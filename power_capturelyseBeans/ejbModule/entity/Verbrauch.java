package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_verbrauch")
public class Verbrauch implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 8910547784460812467L;
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_verbrauch;
    @Column(nullable=false, precision=14, scale=2)
    private BigDecimal zaehlerstand;    
    @Column(nullable=false)
    private Timestamp datum;           
    @Column(name="id_adresse", nullable=false, columnDefinition="INTEGER(11)")    
    @JoinColumn(name="id_adresse", referencedColumnName="id_adresse")		
    private Adresse id_adresse;
    
    @ManyToOne
    @JoinColumn(name="id_energietyp", referencedColumnName="id_energietyp")	
    private Energietyp id_engergietyp;
    
        
    public Verbrauch(){
    	
    }
    
    public Verbrauch(int id_verbrauch, BigDecimal zaehlerstand, Timestamp datum, Energietyp id_energietyp){
	this.id_verbrauch = id_verbrauch;
	this.datum = datum;
	this.zaehlerstand = zaehlerstand;
	this.id_engergietyp = id_energietyp;
	
    }
    
    public Verbrauch(BigDecimal zaehlerstand, Timestamp datum, Energietyp id_energietyp){	
	this.datum = datum;
	this.zaehlerstand = zaehlerstand;
	this.id_engergietyp = id_energietyp;
    }
    
    public int getId_verbrauch() {
        return id_verbrauch;
    }

    public void setId_verbrauch(int id_verbrauch) {
        this.id_verbrauch = id_verbrauch;
    }
    
    public BigDecimal getZaehlerstand() {
        return zaehlerstand;
    }

    public void setZaehlerstand(BigDecimal zaehlerstand) {
        this.zaehlerstand = zaehlerstand;
    }

    @Temporal(TemporalType.TIMESTAMP)   
    public Timestamp getDatum() {
        return datum;
    }
    
    public void setDatum(Timestamp datum) {
        this.datum = datum;
    }
    
    public Adresse getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(Adresse id_adresse) {
        this.id_adresse = id_adresse;
    }
    
    

    @Column(name="id_energietyp", nullable=false, columnDefinition="INTEGER(11)")
    public Energietyp getId_engergietyp() {
        return id_engergietyp;
    }

    public void setId_engergietyp(Energietyp id_engergietyp) {
        this.id_engergietyp = id_engergietyp;
    }



    

}
