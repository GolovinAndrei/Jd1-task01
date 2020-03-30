package by.stech.library.command;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

private Map<CommandName, Command> commands = new HashMap<CommandName, Command>();
	
	public CommandProvider() {
		commands.put(CommandName.REGISTRATION, new RegistrationCommand());
		commands.put(CommandName.AUTHORIZATION, new AuthorizationCommand());
		
		commands.put(CommandName.EDIT_BOOK, new BookEdit());
		commands.put(CommandName.ADD_NEW_BOOK, new AddNewBook());
		commands.put(CommandName.WRONG_REQUEST, new WrongRequest());
	}
	
	
	public Command getCommand(String strCommandName) {
		CommandName commandName = null;
		Command command = null;
		
		try {
			commandName = CommandName.valueOf(strCommandName.toUpperCase());
			command = commands.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			command = commands.get(CommandName.WRONG_REQUEST);
		}
		return command;
	}
}
