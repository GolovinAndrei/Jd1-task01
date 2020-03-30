package by.stech.library.command;

import by.stech.library.bean.User;
import by.stech.library.service.ServiceException;
import by.stech.library.service.ServiceProvider;
import by.stech.library.service.UserService;

public class RegistrationCommand implements Command  {

	@Override
	public String execute(String request) {
		String response;
		String[] array = request.split(" ");
		if (array.length < 2) {
			response = "Not enough information in request(Need \"command login numberOfAccount amount isItBlocked\")...";
			return response;
		}

		String login = array[1];
		String password = array[2];
		String iD = array[3];
	
		UserService service = ServiceProvider.getInstance().getUserService();
		User user = new User(login,password,Integer.parseInt(iD));
		
		try {

			service.registration(user);

			response = "Successfully (" + login + ")";
		
		} catch (ServiceException e) {

			response = "Some problems";

		}
		return response;
	}

}
