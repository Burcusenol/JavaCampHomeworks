package concrete;

import abstracts.GamerCheckService;
import entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
