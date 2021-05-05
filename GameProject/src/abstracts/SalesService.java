package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SalesService {

	void Sale(Gamer gamer,Game game);
	void CampaignSales(Gamer gamer,Game game,Campaign campaign);
	
}
