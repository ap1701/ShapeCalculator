import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Shape Calculator!");
        while (true) {
            System.out.println("\nSelect a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting Shape Calculator...");
                    System.exit(0);
                case 1:
                    System.out.println("Enter the radius of the circle:");
                    double radius = scanner.nextDouble();
                    Shape circle = new Circle(radius);
                    circle.showShape("Circle");
                    circle.calculateShape();
                    circle.calculatePerimeter();
                    break;
                case 2:
                    System.out.println("Enter the length of the rectangle:");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the width of the rectangle:");
                    double width = scanner.nextDouble();
                    Shape rectangle = new Rectangle(length, width);
                    rectangle.showShape("Rectangle");
                    rectangle.calculateShape();
                    rectangle.calculatePerimeter();
                    break;
                case 3:
                    System.out.println("Enter the length of the square's side:");
                    double side = scanner.nextDouble();
                    Shape square = new Square(side);
                    square.showShape("Square");
                    square.calculateShape();
                    square.calculatePerimeter();
                    break;
                case 4:
                    System.out.println("Enter the radius of the sphere:");
                    radius = scanner.nextDouble();
                    Shape sphere = new Sphere(radius);
                    sphere.showShape("Sphere");
                    sphere.calculateShape();
                    ((Volume) sphere).calculateVolume();
                    break;
                case 5:
                    System.out.println("Enter the radius of the cylinder:");
                    radius = scanner.nextDouble();
                    System.out.println("Enter the height of the cylinder:");
                    double height = scanner.nextDouble();
                    Shape cylinder = new Cylinder(radius, height);
                    cylinder.showShape("Cylinder");
                    cylinder.calculateShape();
                    ((Volume) cylinder).calculateVolume();
                    break;
                case 6:
                    System.out.println("Enter the length of the pyramid's base:");
                    length = scanner.nextDouble();
                    System.out.println("Enter the width of the pyramid's base:");
                    width = scanner.nextDouble();
                    System.out.println("Enter the height of the pyramid:");
                    height = scanner.nextDouble();
                    Shape pyramid = new Pyramid(length, width, height);
                    pyramid.showShape("Pyramid");
                    pyramid.calculateShape();
                    ((Volume) pyramid).calculateVolume();
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}
