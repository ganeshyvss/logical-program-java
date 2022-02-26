import java.util.Scanner;
class Arrayevenoddsum{
    
    public static void main(String args[]){
      
      int arr[]={11,20,33,42,25,18,26,81};
      
      Scanner s=new Scanner(System.in);
         int count=0;int evensum=0;
	int oddsum=1;
        for(int i=0;i<arr.length;i++){
         if(arr[i]%2==0){
	   evensum=evensum+arr[i];
		}
        }
		System.out.println("the sum of even elements in array : "+evensum);
        
        for(int i=0;i<arr.length;i++){
      	 if(arr[i]%2!=0){
		oddsum=oddsum+arr[i];
		}
        }
		System.out.println("the sum of odd elements in array : "+oddsum);
        
    
}
}