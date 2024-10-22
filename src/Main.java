import Visitor.*;
public class Main {
    public static void main(String[] args) {
        // Create shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 7);
        Triangle triangle = new Triangle(6, 3);

        // Add shapes to drawing
        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(rectangle);
        drawing.addShape(triangle);

        // Create an AreaCalculator visitor
        Visitor areaCalculator = new AreaCalculator();

        // Calculate areas for all shapes in the drawing
        drawing.calculateAreas(areaCalculator);
    }
}

