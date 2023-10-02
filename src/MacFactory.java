
public class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

	@Override
	public Menu createMenu() {
		// TODO Auto-generated method stub
		return new MacMenu();
	}
}
