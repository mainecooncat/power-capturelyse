package interfaces;

import javax.ejb.Remote;

@Remote
public interface VerbrauchInterface {
    
    public int erzeugeVerbrauch(int id_nutzer);
    

}
