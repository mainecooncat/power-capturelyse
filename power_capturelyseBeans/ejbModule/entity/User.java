package entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_user")
public class User implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -3617527092249858891L;
    
    @Id
    @GeneratedValue
    private int id_user;
    private String username;
    private String uservname;
    private String password;
    
    public int getId(){
	return id_user;
    }
    
    public void setId(int id_user){
	this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUservname() {
        return uservname;
    }

    public void setUservname(String uservname) {
        this.uservname = uservname;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword()
    {
    	return password;
    }
    
    public User(){
	
    }
    
    
	

}
