package by.stech.library.command;

import by.stech.library.service.ServiceException;
import by.stech.library.service.ServiceProvider;
import by.stech.library.service.UserService;

public class AuthorizationCommand implements Command {

	 @Override
	    public String execute(String request) {
	        String response;
	        String[] array = request.split(" ");
	        if (array.length < 3) {
	            response = "Not enough information in request(Need \"command login password\")...";
	            return response;
	        }
	        String login = array[1];
	        String password = array[2];
	       

	        UserService service = ServiceProvider.getInstance().getUserService();
	        try {
	         if (service.signIn(login, password));  {                      
	                response = "Done";
	            } else {
	                response = "Invalid login or password.";
	            }    
	        } catch (ServiceException e) {
	          
	            response = "Eror";
	      
	        }

	        return response;
	    }
}
