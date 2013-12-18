package interfaces;

import javax.ejb.Remote;

import entity.User;

@Remote
public interface UserVerwaltungInterface {
    
    public User createUser(User user);
    public User findUser(int id);
    public void updateUser(User user);
    

}
