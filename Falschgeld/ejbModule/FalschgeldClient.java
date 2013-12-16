

import	javax.naming.Context;	
import	javax.naming.NamingException;	



public class FalschgeldClient {

	public	static	void	main(String[]	args)	{	
		FalschgeldRemote	remote	=	doLookup();	
		//	4.	Call	business	logic	
		System.out.println(remote);
		
		System.out.println(remote.nummerGuelting("X049899711287")); // Geldschein echt true
		
		System.out.println(remote.nummerGuelting("X049899711281")); // Geldschein falsch false
	}	
	
	private	static	FalschgeldRemote	doLookup()	{	
		Context	context	=	null;	
		FalschgeldRemote	remote	=	null;	
		try	{	
		 	//	1.	Obtaining	Context	
		 	context	=	ClientUtility.getInitialContext();	
		 	
		 	//	2.	Generate	JNDI	Lookup	name	
		 	String	lookupName	=	getLookupName();	
		 	//	3.	Lookup	and	cast	
		 	remote	=	(FalschgeldRemote)	context.lookup(lookupName);	
		 	
		}	catch	(NamingException	e)	{	
		e.printStackTrace();	
		}	
	return	remote;	
	}	
	
		
private	static	String	getLookupName()		
	{	
		String	appName	=	"";	
		
		/*	
			*	The	module	name	is	the	JAR	name	of	the	deployed	EJB	without	the	.jar	
			*	suffix.	
			*/	
		String	moduleName	=	"Falschgeld";	
			
		/*	
			*	AS7	allows	each	deployment	to	have	an	(optional)	distinct	name.	This	
			*	can	be	an	empty	string	if	distinct	name	is	not	specified.	
			*/	
		String	distinctName	=	"";	
			
		//	The	EJB	bean	implementation	class	name	
		String	beanName	=	FalschgeldBean.class.getSimpleName();	
			
		//	Fully	qualified	remote	interface	name	
		final	String	interfaceName	=	FalschgeldRemote.class.getName();	
		
		

		//	Create	a	look	up	string	name	
		String	name	=	"ejb:"	+	appName	+	"/"	+	moduleName	+	"/"	+	distinctName	
		+	"/"	+	beanName	+	"!"	+	interfaceName;	
		System.out.println(name);
		return	name;	
		}	
	}	
