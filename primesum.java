import java.util.*;
public class primesum{
    public static void main(String[] args){
         int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=100;i++){
            int temp=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    temp++;
    
                }
            }
            if(temp==0){
                sum=sum+i;
            }
        }
          System.out.println(sum);
    }
}
