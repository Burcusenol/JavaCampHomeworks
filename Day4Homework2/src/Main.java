import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Burcu");
		customer.setLastName("Þenol");
		customer.setDateofBirth(LocalDate.of(1998, 02, 07));
		customer.setNationalityId("54634504518");
		
		customerManager.save(customer);
	}

}
