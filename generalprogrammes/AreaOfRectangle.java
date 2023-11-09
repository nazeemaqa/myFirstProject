package generalprogrammes;

import java.util.Scanner;

public class AreaOfRectangle {
   public static void main (String args[]){
       int l, b, perimeter, area;
       Scanner s = new Scanner(System.in);
       l = s.nextInt();

       System.out.println(" Enter the leghth of rectangle:");
       b = s.nextInt();
       System.out.println(" Enter the bredth of rectangle:");





       perimeter = 2 * (l + b);
       System.out.println("Perimeter of rectangle:" + perimeter);
       area = l * b;
       System.out.println("Area of rectangle:" + area);







   }



}
