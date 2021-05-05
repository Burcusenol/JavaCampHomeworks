package concrete;


import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;


public class NeroCustomerManager extends BaseCustomerManager {

 private CustomerCheckService customerCheckService;
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
	
	this.customerCheckService = customerCheckService;
}
	@Override
	public void save(Customer customer) throws Exception {
		if(customerCheckService.checkIfRealPerson(customer)) {
			 super.save(customer);
			
		}
		else {
			throw new Exception("Not a valid person");
		}
		
	}

	}


