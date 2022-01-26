import java.util.Scanner;

public class wk2q2 {
    public static void main(String[] args)
    {
        double Average;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        float x = in.nextFloat();
        float y = in.nextFloat();
        float z = in.nextFloat();

        Average = (x+y+z) / 3;
        System.out.print("The average of "+ x + " "+ y + " " +z + " is " + Average);

        in.close();
    }
}
