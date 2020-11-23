
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

	}

	@Override
	public void pressXBoxButton() {
		// TODO Auto-generated method stub
		System.out.println("Starting XBox...");

	}

	@Override
	public void pressGameButton() {
		// TODO Auto-generated method stub
		System.out.println("You have to select a gaming system to paly");

	}

}
