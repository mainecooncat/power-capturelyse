package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_energietyp")
public class Energietyp implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 8566587793818247515L;
    
    
    @Id
    @GeneratedValue
    private int id;
    private String energietyp;
    private String einheit;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnergietyp() {
		return energietyp;
	}

	public void setEnergietyp(String energietyp) {
		this.energietyp = energietyp;
	}

	public String getEinheit() {
		return einheit;
	}

	public void setEinheit(String einheit) {
		this.einheit = einheit;
	}

	public Energietyp(){
	
    }
	
	

}
