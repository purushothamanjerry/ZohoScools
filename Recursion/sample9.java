package Sample;

public class sample9 {

	public static void main(String[] args) {
		int arr[]={3,2,6,9,5};
		System.out.println(minimum(arr,0));
	}
	static int minimum(int arr[],int i){
		if(i>=arr.length) {
			return arr[i-1];
		}
		return Math.min(arr[i],minimum(arr,i+1));
	}

}
