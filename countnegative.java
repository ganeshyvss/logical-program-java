  public class countnegative {
	public static void main(String[] args) {
		int[] arr = {10,20,-34,-45,79,-27,-19,21};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<0) {
	            sum=sum+arr[i];
			}
			
		}
	    System.out.println(sum);
	}
}