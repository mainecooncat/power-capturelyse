package interfaces;

import javax.ejb.Remote;

import entity.Adresse;
import entity.User;

@Remote
public interface UserVerwaltungInterface {
    
    public User createUser(User user, Adresse adresse);
    public User findUser(int id);
    public void updateUser(User user);
    

}
