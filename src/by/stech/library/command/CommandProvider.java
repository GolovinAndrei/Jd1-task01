package by.stech.library.command;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

	private Map<CommandName, Command> commands = new HashMap<CommandName, Command>();

	public CommandProvider() {
		commands.put(CommandName.REGISTRATION, new RegistrationCommand());
		commands.put(CommandName.ADD_NEW_BOOK, new AddNewBook());
		commands.put(CommandName.AUTHORIZATION, new AuthorizationCommand());
		commands.put(CommandName.TAKE_BOOK, new TakeBook());
		commands.put(CommandName.GIVE_BACK_BOOK, new GiveBackBook());
		commands.put(CommandName.WRONG_REQUEST, new WrongRequest());
		commands.put(CommandName.SHOW_BOOKS, new ShowBook());
	}
	}

	public Command getCommand(String strCommandName) {
		CommandName commandName;
		Command command;

		try {
			commandName = CommandName.valueOf(strCommandName.toUpperCase());
			command = commands.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
		
			command = commands.get(CommandName.WRONG_REQUEST);
		}
		return command;
	}
}
