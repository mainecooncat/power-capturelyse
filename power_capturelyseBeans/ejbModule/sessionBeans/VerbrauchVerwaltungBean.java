package sessionBeans;

import interfaces.VerbrauchVerwaltungInterface;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.jboss.logging.Logger;

import entity.Verbrauch;

@Stateless
public class VerbrauchVerwaltungBean implements VerbrauchVerwaltungInterface{
    
    static Logger logger = Logger.getLogger(VerbrauchVerwaltungBean.class);
    
    @PersistenceContext(name="powerCapturelyseBeans")
    private EntityManager em;
       
    @Override
    public Verbrauch createVerbrauch(Verbrauch verbrauch) {
	em.persist(verbrauch);
	return verbrauch;
    }

    @Override
    public void updateVerbrauch(Verbrauch verbrauch) {
	em.merge(verbrauch);
	
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Verbrauch> getVerbraeuche(int id_nutzer, int id_energietyp) {
	List<Verbrauch> resultList = em.createQuery("SELECT * from tb_verbrauch where id_nutzer = " + id_nutzer + "and id_energietyp = " + id_energietyp).getResultList();
	logger.debug("Anzahl der gefundenen Verbräuche: " + resultList.size());
	return resultList;
    }

}
