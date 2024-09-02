import java.util.*;
import java.lang.*;

public class Add
{
    public static void main(String [] args)
    {

        int No1,No2,Sum;
        Scanner S = new Scanner(System.in);

        System.out.print("\n Enter First Number : ");
        No1 = S.nextInt();

        System.out.print("\n Enter Second Number : ");
        No2 = S.nextInt();

        Sum = No1 + No2;

        System.out.print("\n Addition of " + No1 + " And " + No2 + " is = " + Sum);
    }
}