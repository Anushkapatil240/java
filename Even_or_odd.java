import java.lang.*;
import java.util.*;

public class Even_or_odd
{
	  public static void main(String[] args)
	  {
			int No ;
			Scanner S = new Scanner(System.in);

			System.out.print("\n Enter a Number : ");
			No = S.nextInt();

			if(No % 2 == 0)
			{
				System.out.print("\n Number is Even");
			}
			else
			{
				System.out.print("\n Number is Odd");
			}
	  }
}
