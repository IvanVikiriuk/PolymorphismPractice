package app;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{
                new Circle(7),
                new Triangle(6, 9),
                new Square(5)
        };
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        System.out.printf("Total area of all figures: %.2f ", totalArea);
    }
}
