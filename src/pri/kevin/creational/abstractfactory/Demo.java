package pri.kevin.creational.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        GUIFactory factory = new MacOSFactory();
        Application app = new Application(factory);
        app.paint();
    }
}
