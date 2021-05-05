package abstracts;

import entities.Gamer;

public class BaseGamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) throws Exception{
		System.out.println("Added to : " + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) throws Exception {
		System.out.println("Updated to : " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) throws Exception {
		System.out.println("Deleted to : " + gamer.getFirstName());
		
	}

}
