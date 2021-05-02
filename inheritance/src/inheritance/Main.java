package inheritance;

public class Main {

	public static void main(String[] args) {
	
		IndividualCustomer engin= new IndividualCustomer();
		
		engin.customerNumber="12345";
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		SendikaCustomer sendikaCustomer=new SendikaCustomer();
		sendikaCustomer.customerNumber="99999";
		
		CustomerManager customerManager=new CustomerManager();
		Customer[] customers= {engin,sendikaCustomer,hepsiBurada};
		customerManager.addMultiple(customers);

		
	}

}
