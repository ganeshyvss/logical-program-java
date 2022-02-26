//write a program to print 1-n numbers using while loop//

import java.util.Scanner;
public class Whilenum {
    public static void main(String args[]) 
{
    int i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num");
    int n=sc.nextInt();
    while(i<=n)
      {
          System.out.println(i);
          i++;
      }
}
}