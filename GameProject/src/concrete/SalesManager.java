package concrete;

import abstracts.SalesService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SalesManager  implements SalesService{

	@Override
	public void Sale(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+ " sold to : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void CampaignSales(Gamer gamer, Game game, Campaign campaign) {
	System.out.println(game.getGameName()+ " sold to : "+gamer.getFirstName()+" "+gamer.getLastName()+" with "+ campaign.getCampaignDiscount());
	}

}
