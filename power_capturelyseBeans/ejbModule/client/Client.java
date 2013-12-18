package client;

import javax.ejb.EJB;
import javax.naming.NamingException;

import entity.Adresse;
import entity.User;
import serviceLocator.ServiceLocator;
import interfaces.AdressVerwaltungInterface;
import interfaces.UserVerwaltungInterface;
import interfaces.VerbrauchVerwaltungInterface;


public class Client {
	
    @EJB
    private static UserVerwaltungInterface userverwaltung;
    
    @EJB
    private static VerbrauchVerwaltungInterface verbrauchsverwaltung;
    
    @EJB 
    private static AdressVerwaltungInterface adresseverwaltung;
    
	public static void main (String[]args) throws NamingException{
	    
	    
	    	ServiceLocator locator = new ServiceLocator();
	    	userverwaltung = (UserVerwaltungInterface)locator.getStateless("", "power_capturelyseBeans", "UserVerwaltungBean", UserVerwaltungInterface.class);
	    	User user = new User("InNot", "Holland", "egal");	    	
	    	Adresse adresse = new Adresse("bocholt", 46399, "Westend", user);
	    	user = userverwaltung.createUser(user,adresse);
	    	System.out.println(user);
	    	System.out.println(adresse);
		
		
	}
	

}

