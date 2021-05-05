package entities;

public class Campaign {
 private int campaignId;
 private String campaignName;
 private String campaignDiscount;
 
 public Campaign() {
	 
 }
public Campaign(int campaignId, String campaignName, String campaignDiscount) {
	super();
	this.campaignId = campaignId;
	this.campaignName = campaignName;
	this.campaignDiscount = campaignDiscount;
}
public int getCampaignId() {
	return campaignId;
}
public void setCampaignId(int campaignId) {
	this.campaignId = campaignId;
}
public String getCampaignName() {
	return campaignName;
}
public void setCampaignName(String campaignName) {
	this.campaignName = campaignName;
}
public String getCampaignDiscount() {
	return campaignDiscount;
}
public void setCampaignDiscount(String campaignDiscount) {
	this.campaignDiscount = campaignDiscount;
}


}
