public class occurance{
    
    public static void main(String args[]){
      int arr[]={54,63,44,73,90,23,23,50};
       int count=1;
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j]){
                  count++;
                  arr[j]=0;
              }
          }
          if(arr[i]!=0){
              System.out.println(arr[i] +" : "+count);
          }
          count=1;
      }
    }
}