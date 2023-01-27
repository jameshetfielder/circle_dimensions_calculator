
import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int radius;
        double pi = 3.14;
        double circle;
        double totalArea;
        int centerAngle;
        double partialArea;

        System.out.print("Enter radius: ");
        radius = input.nextInt();
        System.out.print("Enter center angle: ");
        centerAngle = input.nextInt();
        totalArea = pi * radius * radius;
        circle = 2 * pi * radius;
        partialArea = ( pi * (radius * radius) * centerAngle) / 360;
        System.out.println("Area is: " + totalArea + "\nCircle is:" + circle);
        System.out.print("Partial area is: " + partialArea);
    }
}