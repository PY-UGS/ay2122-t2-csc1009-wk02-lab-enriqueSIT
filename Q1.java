import java.util.*;


    class Circle {
        double pi = 3.14159;
        double radius;
    
        Circle() {
            radius = 1;
        }

        Circle(double newRadius) {
            radius = newRadius;
        }
        double getArea() {
            return radius * radius * pi;
        }
        double getPerimeter() {
            return 2 * radius * pi;
        }
        void setRadius(double newRadius) {
            radius = newRadius;
        }
    }

public class Q1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number for radius: ");
        // Scans the next token of the input as an double (radius can have floating point).
        double radius = reader.nextDouble(); 
        reader.close();
        Circle circle1 = new Circle(radius);
        System.out.println("The area of the circle (" + circle1.radius + "): " + circle1.getArea());
    }
}
