import java.util.*;
import java.lang.*;

public class Multi {
    public static void main (String [] args){

        int N1 , N2 , Multi;

        Scanner S = new Scanner (System.in);

        System.out.print("\n Number 1 : ");
        N1 = S.nextInt();

        System.out.print("\n Number 2 : ");
        N2 = S.nextInt();

        Multi = N1 * N2 ;

        System.out.print("\n The result of multiplying " + N1 + " and " + N2 + " is " + Multi);


    }
    
}
