public class Application {
    private GUIFactory factory;
    private Button button;
    private Menu menu;

    public Application(GUIFactory factory) {
        this.factory = factory;
        this.button = factory.createButton();
        this.menu = factory.createMenu();
    }

    public void render() {
        button.render();
        menu.render();
    }
}