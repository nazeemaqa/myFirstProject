package generalprogrammes;

import java.util.Scanner;

public class AreaOfSquare {

    public static void main(String[] args)
    {
        float side, area ,perimeter,S;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Side Length of Square: ");
        side = s.nextFloat();

        area = side*side;


        System.out.println("Area = " +area);
        perimeter = 4*side;
        System.out.println("Perimeter = " +perimeter);

    }
}








