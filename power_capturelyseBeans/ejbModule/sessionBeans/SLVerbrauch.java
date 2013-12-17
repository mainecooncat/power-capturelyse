package sessionBeans;

import interfaces.VerbrauchInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.Verbrauch;

@Stateless
public class SLVerbrauch implements VerbrauchInterface{
    
    @PersistenceContext(name="powerCapturelyseBeans")
    private EntityManager em;
    
    @SuppressWarnings("unchecked")
    public List<String> zeigeAlleVerbraeuche(int id_nutzer, int id_energietyp){
	List<Verbrauch> verbrauch = em.createQuery("SELECT * from tb_verbrauch where id_nutzer = " + id_nutzer + "and id_energietyp = " + id_energietyp).getResultList();
	List<String> result = new ArrayList<String>();
	for(Verbrauch v : verbrauch){
	    result.addAll((Collection<? extends String>) v);
	}
	
	return result;
	
    }

    @Override
    public void createVerbrauch(Verbrauch verbrauch) {
	em.persist(verbrauch);
    }

    @Override
    public void updateVerbrauch(Verbrauch verbrauch) {
	em.merge(verbrauch);
	
    }

    @SuppressWarnings("unchecked")
    @Override
    public Collection<Verbrauch> getVerbraeuche() {
	Query query = em.createNamedQuery("select * from Verbrauch v");
	return (Collection<Verbrauch>)query.getResultList();
    }

}
