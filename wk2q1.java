import java.util.Scanner;

public class wk2q1 {
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");

        double radius = input.nextDouble();

        double Output = PI*(radius*radius);
        System.out.println("The area for the circle of radius " + radius + " is "+ Output);

        input.close();
    }
}
