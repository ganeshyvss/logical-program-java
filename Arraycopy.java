public class Arraycopy
{    
public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,5,6,7};
        int[] a=arr;
        
           System.out.println("actual array :");
          for(int i=0;i<arr.length;i++)
        {         
            System.out.println(arr[i]);
        }         
          System.out.println("copied array :");
         for(int i=0;i<a.length;i++)
        {
         System.out.println(a[i]);
        }     
    }    
    