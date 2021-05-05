package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Added to : " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Updated to : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Deleted to : " + game.getGameName());
		
	}

}
