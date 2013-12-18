package sessionBeans;

import interfaces.UserVerwaltungInterface;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.logging.Logger;

import entity.User;


@Stateless
public class UserVerwaltungBean implements UserVerwaltungInterface{
    
    static Logger logger = Logger.getLogger(UserVerwaltungBean.class); 
    @PersistenceContext(unitName="powerCapturelyseBeans") 
    private EntityManager em;

    public User createUser(User user) {			
	em.persist(user);
	return user;
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
