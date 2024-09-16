import java.util.*;
import java.lang.*;


public class Meter {
    public static void main(String[] args){
        double kilometer;
        double meter;

        Scanner S = new Scanner(System.in);

        System.out.print("\n Distance : " );
        kilometer = S.nextDouble();

        meter = 1000 * kilometer;
        System.out.print("\n Distance in meters : " + meter + " meters ");
    }
    
}
