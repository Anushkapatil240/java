import java.lang.*;
import java.util.*;

public class Table1
{
    public static void main(String[] args)
    {
        int No , i ;
		
		Scanner S = new Scanner(System.in);
		
		System.out.print("\n Enter a Number : ");
		No = S.nextInt();

        for(i = 1 ; i <= 10; i++ )
        {
            System.out.println(" " + No + " * " + i + " = " + No * i);
        }
      
    }
}
