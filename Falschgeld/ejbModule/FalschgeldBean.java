import javax.ejb.Stateless;

@Stateless
public class FalschgeldBean implements FalschgeldRemote {

	@Override
	public boolean nummerGuelting(String nummer) {
		
		System.out.println("bean");
		if(nummer == null)
		{
		System.out.println("leere String");
		}
		if(nummer.length()!=12)
		{
		System.out.println("String muss 12 Zeichen haben");
		}
		
		char[] ziffern = nummer.toCharArray();
		int summe = 0;
		
		for(char zeichen : ziffern)
		{
				if (zeichen >= '0' && zeichen <= '9')
				{summe = summe + zeichen - '0';}
			
			else if (zeichen >='A' && zeichen <= 'Z')
				{summe = summe + zeichen - 'A' + 1;}
			
		}
		
		int quersumme = summe;
		while(summe>9)
		{
			quersumme = 0;
			while(summe!=0)
			{
				quersumme += summe % 10;
				summe /=10;
			}
			summe = quersumme;
		}
		
		if(quersumme == 8)
		{	
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
}
