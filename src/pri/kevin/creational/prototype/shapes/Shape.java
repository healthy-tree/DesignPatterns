package pri.kevin.creational.prototype.shapes;

import java.util.Objects;

public abstract class Shape {
    public int x, y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target){
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    @Override
    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape)) {
            return false;
        }
        Shape shape2 = (Shape) obj;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
