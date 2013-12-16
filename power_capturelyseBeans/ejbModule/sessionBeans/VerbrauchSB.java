package sessionBeans;

import interfaces.VerbrauchInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Verbrauch;

@Stateless
public class VerbrauchSB implements VerbrauchInterface{
    
    private @PersistenceContext EntityManager em;
    
    @SuppressWarnings("unchecked")
    public List<String> zeigeAlleVerbraeuche(int id_nutzer){
	List<Verbrauch> verbrauch = em.createQuery("SELECT * from tb_verbrauch where id_nutzer = " + id_nutzer).getResultList();
	List<String> result = new ArrayList<String>();
	for(Verbrauch v : verbrauch){
	    result.addAll((Collection<? extends String>) v);
	}
	
	return result;
	
    }

    @Override
    public int erzeugeVerbrauch(int id_nutzer) {
	// TODO Automatisch generierter Methodenstub
	return 0;
    }

}
