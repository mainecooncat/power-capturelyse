package sessionBeans;

import interfaces.UserInterface;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.User;


@Stateless
public class SLUser implements UserInterface{
    
    private @PersistenceContext EntityManager em;

    @Override
    public int createUser() {
	User user = new User();
//	user.setUservname();
//	user.setUsername();
	em.persist(user);
	return user.getId();
    }

    @Override
    public User findUser(int id) {
	return em.find(User.class, id);
	
    }

    
    //ToDo anbinden an JSP wegen usernamen usw.
//    @Override
    public User aktualisiereUser(int id) {
//	User user = this.findUser(int id)
//	    user.setUsername(nachname);
//	    user.setUservname(vorname);
//	}
    	User user = new User();
	return user;
//	
    }
    

}
