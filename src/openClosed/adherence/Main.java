package openClosed.adherence;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Shape rectangle = new Rectangle(4, 4);
        System.out.println("Area of rectangle: " + areaCalculator.calculate(rectangle));

        Shape circle = new Circle(5.5);
        System.out.println("Area of circle: " + areaCalculator.calculate(circle));
    }
}
