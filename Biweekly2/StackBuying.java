package Biweekly;

public class StackBuying {

	public static void main(String[] args) {
		
		int arr[]={3,4,6,1,12,5};
		int dp[]=new int[arr.length];
		for(int i=0;i<dp.length;i++) {
			int j=i+1;
			while(j<arr.length) {
				if(arr[j]>arr[i]) {
					dp[i]=dp[i]<arr[j]-arr[i]?arr[j]-arr[i]:dp[i];
				}
				j++;
			}
		}
		int max=0;
		for(int i:dp) {
			max=max>i?max:i;
		}
		System.out.println(max);
	}
}
