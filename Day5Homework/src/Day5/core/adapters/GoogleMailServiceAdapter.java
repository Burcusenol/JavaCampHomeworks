package Day5.core.adapters;

import Day5.core.abstracts.GoogleEmailService;
import Day5.googleLogger.GoogleLoggerManager;

public class GoogleMailServiceAdapter implements GoogleEmailService {

	

	@Override
	public void send(String email, String message) {
		GoogleLoggerManager googleLoggerManager=new GoogleLoggerManager();
		googleLoggerManager.send(email, message);
		
	}

}
