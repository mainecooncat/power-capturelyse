package interfaces;

import java.util.Collection;

import javax.ejb.Remote;

import entity.Verbrauch;

@Remote
public interface VerbrauchInterface {
    
    public void createVerbrauch(Verbrauch verbrauch);
    public void updateVerbrauch(Verbrauch verbrauch);
    public Collection<Verbrauch> getVerbraeuche();
    

}
