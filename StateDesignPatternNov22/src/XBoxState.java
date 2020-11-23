
public class XBoxState implements State {

	private GameConsole gameConsole;
	private String[] xBoxGames = { "Luigi", "Call of Duty", "Super Smash Bros.", "Donkey Mong", "Tree's Cell" };


	public XBoxState(GameConsole gameConsole2) {
		this.gameConsole = gameConsole2;
	}

	@Override
	public void pressHomeButton() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Homescreen...");
	}

	@Override
	public void pressNintendoButton() {
		// TODO Auto-generated method stub
		System.out.println("Starting Nintendo...");
	}

	@Override
	public void pressXBoxButton() {
		// TODO Auto-generated method stub
		System.out.println("You are already viewing XBox!");
	}

	@Override
	public void pressGameButton() {
		// TODO Auto-generated method stub
		System.out.println("You have the following games:");
		String gameList = "";
		for (int i = 0; i < xBoxGames.length; i++) {
			if (i < xBoxGames.length - 1 ) {
			gameList+= xBoxGames[i] +", ";
			} else {
				gameList+= xBoxGames[i];
			}
		}

	}

}
