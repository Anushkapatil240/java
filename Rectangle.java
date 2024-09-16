import java.util.*;
import java.lang.*;


public class Rectangle {
    public static void main (String [] args){

        double width , height , area;

        Scanner S = new Scanner(System.in);

        System.out.print("\n Enter width : " );
        width = S.nextDouble();

        System.out.print("\n Enter height : " );
        height = S.nextDouble();

        area = width * height;
        System.out.print("\n Area of rectangle is : " + area);

    }
    
}
