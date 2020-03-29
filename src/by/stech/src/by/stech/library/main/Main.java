package by.stech.library.main;

import by.stech.library.command.Controller;

public class Main {

	public static void main(String[] args) {
		
Controller controller = new Controller();
		
		String request, response;
		
		request = "REGISTRATION login= password= name=Andr";

		response = controller.action(request);
		
		System.out.println(response);

		request = "AUTHORIZATION login=fdgdfg password=dfgdfg";

		response = controller.action(request);
		
		System.out.println(response);
	
	
	}

}
