package sessionBeans;

import interfaces.UserInterface;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.logging.Logger;

import entity.User;


@Stateless
public class SLUser implements UserInterface{
    
    static Logger logger = Logger.getLogger(SLUser.class); 
    @PersistenceContext(unitName="powerCapturelyseBeans") 
    private EntityManager em;

    @Override
    public void createUser(User user) {
	em.persist(user);
    }

    @Override
    public User findUser(int id) {
	return em.find(User.class, id);
	
    }

    
    //ToDo anbinden an JSP wegen usernamen usw.
//    @Override
    public void updateUser(User user) {
	em.merge(user);

	
    }
    

}
