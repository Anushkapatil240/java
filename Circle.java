import java.util.*;
import java.lang.*;


public class Circle {

    public static void main(String[] args) {
        
        double radius , pi = 3.14 , area;

        Scanner S = new Scanner(System.in);

        System.out.print("\n Enter radius : " );
        radius = S.nextDouble();

        area = pi * radius * radius;
        System.out.print("\n Area of circle is : " + area);

    }
    
}
