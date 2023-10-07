import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please select a shape type: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter height of the rectangle: ");
                    double height = scanner.nextDouble();
                    shape = new Rectangle(width, height);
                    break;
                case 2:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 3:
                    System.out.print("Enter length of side 1 of the triangle: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter length of side 2 of the triangle: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter length of side 3 of the triangle: ");
                    double side3 = scanner.nextDouble();
                    shape = new Triangle(side1, side2, side3);
                    break;
                case 4:
                    System.out.print("Enter side length of the square: ");
                    double sideLength = scanner.nextDouble();
                    shape = new Square(sideLength);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            if (shape != null) {
                System.out.println("Shape selected: " + shape.name);
                System.out.println("Area: " + shape.getArea());
                System.out.println("Perimeter: " + shape.getPerimeter());
            }

            System.out.println();
        }
    }
}






