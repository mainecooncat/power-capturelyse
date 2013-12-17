package client;

import interfaces.UserInterface;

import javax.naming.Context;
import javax.naming.NamingException;

import sessionBeans.SLUser;

public class Client {
	
	public static void main (String[]args){
		
		UserInterface remote= doLookup();
		
//		remote.createUser();
		
	}
	
	
	private static UserInterface doLookup(){
		Context context = null;
		UserInterface remote = null;
		try{
		    //1.Obtaining Context
		    context = ClientUtility.getInitialContext();
		    //2. Generate JNDI Lookup name
		    String lookupName = getLookupName();
		    //3. Lookup and cast
		    remote = (UserInterface)context.lookup(lookupName);
		}catch(NamingException e){
		    e.printStackTrace();	    
		}
		return remote;
	    }
	
	private static String getLookupName() {
	    	
		String appName = "";
		
		/*
		 * The module name is the JAR name of the deployed EJB without the .jar suffix
		 */
		String moduleName = "power_capturelyseBeans";
		
		/*
		 * AS7 allows each deployment to have an (optional) distinct name. This
		 * can be an empty string if distinct name is not specified
		 */
		String distinctName = "";
		
		//The EJB bean implementation class name
		String beanName = SLUser.class.getSimpleName();
		
		//Fully qualified remote interface name
		final String interfaceName = UserInterface.class.getName();
		
		//Create a look up string name
		//ejb:<app-name>/<module-name>/<distinct-name>/<bean-name>!fully-qualified-classname-of-the-remote-interface>
		String name = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceName;
		
		System.out.println("name: " + name);
		
		return name;
	    }

}

