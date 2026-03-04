	package Sample;

public class Sample10 {

	public static void main(String[] args) {
		int arr[]={0,7,4,6,9,3};
		System.out.println(even(arr,0));
	}
	static int even(int[]arr,int i) {
		if(i==arr.length) {
			return 0;
		}
		int c=arr[i]%2==0?1:0;
		return c+even(arr,i+1);
	}
}
