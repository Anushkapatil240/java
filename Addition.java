import java.util.*;
import java.lang.*;

public class Addition {
    public static void main (String [] args){
        int N1 , N2 , Sum;

        Scanner S  = new Scanner(System.in);

        System.out.print("\n Number 1 : ");
        N1 = S.nextInt();

        System.out.print("\n Number 2 : ");
        N2 = S.nextInt();

        Sum = N1 + N2;

        System.out.print("\n The result of adding " + N1 + " And " + N2 + " is " + Sum);
    }
    
}
