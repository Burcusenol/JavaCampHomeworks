import java.time.LocalDate;

import abstracts.BaseGamerManager;
import adapter.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.GamerManager;
import concrete.SalesManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) throws Exception {
	BaseGamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
	
	Gamer gamer=new Gamer();
	gamer.setId(1);
	gamer.setFirstName("Burcu");
	gamer.setLastName("Þenol");
	gamer.setDateOfBirth(LocalDate.of(1998,02,07));
	gamer.setNationalityId("54634460518");
	
	gamerManager.add(gamer);
	
	Game game=new Game();
	game.setGameId(1);
	game.setGameName("ABC");
	game.setGamePrice(200);
	
	GameManager gameManager=new GameManager();
	gameManager.add(game);
	
	Campaign campaign=new Campaign();
	campaign.setCampaignId(1);
	campaign.setCampaignName("CBA");
	campaign.setCampaignDiscount("%50");
	
	CampaignManager campaignManager=new CampaignManager();
	campaignManager.add(campaign);
	
	SalesManager salesManager=new SalesManager();
	salesManager.Sale(gamer, game);
	salesManager.CampaignSales(gamer, game, campaign);
	
	
	}

}
