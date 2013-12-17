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
import javax.persistence.JoinTable;
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
    @Column(nullable=false, precision=14, scale=2) private BigDecimal zaehlerstand;    
    @Column(nullable=false) private Timestamp datum;   
        
        
    @Column(nullable=false, columnDefinition="INTEGER(11)")private Adresse id_adresse;
    @Column(nullable=false, columnDefinition="INTEGER(11)") private Energietyp id_engergietyp;
    
            
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


    @Column(nullable=false)
    @JoinTable(name="tb_adresse", joinColumns={
		@JoinColumn(name="id_adresse", referencedColumnName="id_adresse")
		}
	)
    public Adresse getId_adresse() {
        return id_adresse;
    }



    public void setId_adresse(Adresse id_adresse) {
        this.id_adresse = id_adresse;
    }


    @ManyToOne
    @JoinTable(name="tb_energietyp", joinColumns={
		@JoinColumn(name="id_energietyp", referencedColumnName="id_energietyp")
		}
	)
    public Energietyp getID_engergietyp() {
        return id_engergietyp;
    }


    public void setId_engergietyp(Energietyp id_engergietyp) {
        this.id_engergietyp = id_engergietyp;
    }



    public Verbrauch(){
	
    }

}
