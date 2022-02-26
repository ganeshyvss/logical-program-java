//write a program reverse of a given number//

import java.util.*;
public class Reverse{
    public static void main(String args[]){
        int rem=0;int rev=0;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        num=sc.nextInt();
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of a number is : "+rev);
    }
}
