public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

	@Override
	public Menu createMenu() {
		// TODO Auto-generated method stub
		return new WindowsMenu();
	}
}