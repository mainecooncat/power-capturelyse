package interfaces;

import javax.ejb.Remote;

import entity.User;

@Remote
public interface UserInterface {
    
    int createUser();
    User findUser(int id);
    User aktualisiereUser(int id);
    

}
