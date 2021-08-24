package pri.kevin.structural.bridge2;

public class Demo {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color green = new GreenColor();
        Shape tri = new Triangle(red);
        tri.applyColor();

        Shape pent = new Pentagon(green);
        pent.applyColor();
    }
}
