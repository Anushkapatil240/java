import java.util.*;
import java.lang.*;


public class Percentage {
    public static void main (String [] args){
        int Subject1 , Subject2 , Subject3 , Total;
        double Percentage;

        Scanner S = new Scanner (System.in);

        System.out.print("\n Enter marks of Subject1 : ");
        Subject1 = S.nextInt();

        
        System.out.print("\n Enter marks of Subject2 : ");
        Subject2 = S.nextInt();

        
        System.out.print("\n Enter marks of Subject3 : ");
        Subject3 = S.nextInt();

        Total = Subject1 + Subject2 + Subject3;
        System.out.print("\n Total marks : " + Total);

        Percentage = (Total/3.0);
        System.out.print("\n Percentage : " + Percentage + " % ");


    }
}