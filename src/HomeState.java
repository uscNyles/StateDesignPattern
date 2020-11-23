
/**
 * Defines the GameConsole behavior when it's in a Home state.
 * Each Button pressed Navigates the Console to the correct state if necessary
 * @author nylesgeiger
 *
 */
public class HomeState implements State {
	
	private GameConsole gameConsole;

	public HomeState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}

	@Override
	public void pressHomeButton() {
		System.out.println("You are already on the Homescreen!");

	}

	@Override
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());

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
		System.out.println("You have to select a gaming system to paly");

	}

}
