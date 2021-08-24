package pri.kevin.creational.factory;

public class Demo {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {
        dialog = new HtmlDialog();
    }
}
