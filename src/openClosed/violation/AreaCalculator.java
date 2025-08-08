package openClosed.violation;

public class AreaCalculator {
    public double calculate(Shape shape) {
        if(shape instanceof Rectangle rectangle) {
            return rectangle.getHeight() * rectangle.getWidth();
        } else if (shape instanceof Circle circle) {
            return Math.PI * circle.getRadius() * circle.getRadius();
        }

        return 0.0;
    }
}
