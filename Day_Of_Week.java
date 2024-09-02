import java.util.*;
import java.lang.*;

public class Day_Of_Week {
    public static void main(String [] args)
    {
        int Day;
        Scanner S = new Scanner(System.in);

        System.out.print("\n Enter Day Number (1-2) : ");
        Day = S.nextInt();

        if( Day <= 0 || Day > 7)
		{
			System.out.println("\n Invalid Day Number.");
		}
		else if(Day == 1)
		{
			System.out.println("\n Monday");
		}
		else if(Day == 2)
		{
			System.out.println("\n Tuesday");
		}
		else if(Day == 3)
		{
			System.out.println("\n Wednesday");
		}
		else if(Day == 4)
		{
			System.out.println("\n Thursday");
        }
		else if(Day == 5)
		{
			System.out.println("\n Friday");
		}
		else if(Day == 6)
		{
			System.out.println("\n Saturday");
		}
		else if(Day == 7)
		{
			System.out.println("\n Sunday");
		}
  }
}

        
    
    

