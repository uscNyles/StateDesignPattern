
public class NintendoState implements State {

	private GameConsole gameConsole;
	private String[] nintendoGames = { "Mario", "Call of Duty", "Super Smash Bros.", "Donkey Kong", "Splinter Cell" };

	public NintendoState(GameConsole gameConsole2) {
		this.gameConsole = gameConsole2;
	}

	@Override
	public void pressHomeButton() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Homescreen...");
		gameConsole.setState(gameConsole.getHomeState());

	}

	@Override
	public void pressNintendoButton() {
		// TODO Auto-generated method stub
		System.out.println("You are already viewing Nintendo!");

	}

	@Override
	public void pressXBoxButton() {
		// TODO Auto-generated method stub
		System.out.println("Starting XBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}

	@Override
	public void pressGameButton() {
		// TODO Auto-generated method stub
		System.out.println("You have the following games:");
		String gameList = "";
		for (int i = 0; i < nintendoGames.length; i++) {
			if (i < nintendoGames.length - 1) {
				gameList += nintendoGames[i] + ", ";
			} else {
				gameList += nintendoGames[i];
			}
		}
		
		System.out.println(gameList);
		System.out.println();
	}

}
