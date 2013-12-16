import javax.ejb.Remote;

@Remote
public interface FalschgeldRemote {

	public boolean nummerGuelting(String nummer);
	
}
