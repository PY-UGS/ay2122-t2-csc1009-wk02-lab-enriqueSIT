
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Qn 2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println(String.format("The average of %.1f %.1f %.1f is %.1f\n", a, b, c, avg));
        input.close();
    }
}
