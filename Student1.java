import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Student1 {
    public static void main(String [] args)
    throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     String S = br.readLine();

     int I = Integer.parseInt(br.readLine());

     System.out.print("\n Enter Name : " + S);

     System.out.print("\n Enter Rollno : " + I);
    }
    
}
