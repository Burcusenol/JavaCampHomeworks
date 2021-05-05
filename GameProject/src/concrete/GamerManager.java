package concrete;

import abstracts.BaseGamerManager;
import abstracts.GamerCheckService;
import entities.Gamer;

public class GamerManager extends BaseGamerManager {

	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override 
	public void add(Gamer gamer) throws Exception {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			super.add(gamer);
			
		}
		else {
			throw new Exception("Not a valid person");
		}
	}
	
	
	

}
