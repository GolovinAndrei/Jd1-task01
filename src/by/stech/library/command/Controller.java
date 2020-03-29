package by.stech.library.command;

public class Controller {

	private final CommandProvider provider = new CommandProvider();
	
	 private final char paramDelimiter = ' ';

	    public String action(String request) {
	        String commandName;
	        Command executionCommand;

	        commandName = request.substring(0, request.indexOf(paramDelimiter));
	        executionCommand = provider.getCommand(commandName);

	        String response;
	        response = executionCommand.execute(request);

	        return response;
}
}
