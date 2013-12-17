package interfaces;

import javax.ejb.Remote;

import entity.User;

@Remote
public interface UserInterface {
    
    public void createUser(User user);
    public User findUser(int id);
    public void updateUser(User user);
    

}
