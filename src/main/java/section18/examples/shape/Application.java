package section18.examples.shape;

import section18.examples.model.entities.AbstractShape;
import section18.examples.model.entities.Circle;
import section18.examples.model.entities.Rectangle;
import section18.examples.model.enums.Color;

public class Application {
    public static void main(String[] args) {
        AbstractShape abstractCircle = new Circle(Color.BLACK, 2.0);
        AbstractShape abstractRectangle = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + abstractCircle.getColor());
        System.out.println("Circle area: " + String.format("%.2f", abstractCircle.area()));

        System.out.println("Rectangle color: " + abstractRectangle.getColor());
        System.out.println("Rectangle area: " + String.format("%.2f", abstractRectangle.area()));
    }
}
