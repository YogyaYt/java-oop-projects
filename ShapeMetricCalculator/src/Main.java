public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0 , 2.5);
        Circle circle = new Circle(5.0);
        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);

        System.out.println("Area of Rectangle is: " + areaOfRectangle);
        System.out.println("Area of Circle is: " + areaOfCircle);
        
    }
}
