package client;

import javax.ejb.EJB;
import javax.naming.NamingException;

import entity.User;
import serviceLocator.ServiceLocator;
import interfaces.UserVerwaltungInterface;
import interfaces.VerbrauchVerwaltungInterface;


public class Client {
	
    @EJB
    private static UserVerwaltungInterface userverwaltung;
    
    @EJB
    private static VerbrauchVerwaltungInterface verbrauch;
    
	public static void main (String[]args) throws NamingException{
	    
	    
	    	ServiceLocator locator = new ServiceLocator();
	    	userverwaltung = (UserVerwaltungInterface)locator.getStateless("", "power_capturelyseBeans", "UserVerwaltungBean", UserVerwaltungInterface.class);
//	    	userverwaltung = new ServiceLocator().getUserVerwaltung();
	    	User user = new User("Heinz", "Ketchup", "password");
	    	user = userverwaltung.createUser(user);
	    	System.out.println(user);
		
		
	}
	
//	
//	private static UserVerwaltungInterface doLookup(){
//		Context context = null;
//		UserVerwaltungInterface remote = null;
//		try{
//		    //1.Obtaining Context
//		    context = ClientUtility.getInitialContext();
//		    //2. Generate JNDI Lookup name
//		    String lookupName = getLookupName();
//		    //3. Lookup and cast
//		    remote = (UserVerwaltungInterface)context.lookup(lookupName);
//		}catch(NamingException e){
//		    e.printStackTrace();	    
//		}
//		return remote;
//	    }
//	
//	private static String getLookupName() {
//	    	
//		String appName = "";
//		
//		/*
//		 * The module name is the JAR name of the deployed EJB without the .jar suffix
//		 */
//		String moduleName = "power_capturelyseBeans";
//		
//		/*
//		 * AS7 allows each deployment to have an (optional) distinct name. This
//		 * can be an empty string if distinct name is not specified
//		 */
//		String distinctName = "";
//		
//		//The EJB bean implementation class name
//		String beanName = UserVerwaltungBean.class.getSimpleName();
//		
//		//Fully qualified remote interface name
//		final String interfaceName = UserVerwaltungInterface.class.getName();
//		
//		//Create a look up string name
//		//ejb:<app-name>/<module-name>/<distinct-name>/<bean-name>!fully-qualified-classname-of-the-remote-interface>
//		String name = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceName;
//		
//		System.out.println("name: " + name);
//		
//		return name;
//	    }

}

