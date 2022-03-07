import java.util.Scanner;
public class primenumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=100;i++){
            int temp=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    temp++;
                    break;
                }
            }
            if(temp==0 && i!=1 ){
                System.out.println(i+" ");
            }
        }
    }
}