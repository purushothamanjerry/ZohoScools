package Biweekly;

public class DecodeString {

	public static void main(String[] args) {
		
		int prev1=1;
		int prev2=1;
		String s="226";
		if(s.length()==0 || s.charAt(0)-'0'==0) {
			System.out.println(0);
			return;
		}
		for(int i=1;i<s.length();i++) {
			int num=0;
			if(s.charAt(i)-'0'!=0) {
				num+=prev1;
			}
			int digit=((s.charAt(i-1)-'0')*10)+s.charAt(i)-'0';
			if(digit>9 && digit<27) {
				num+=prev2;
			}
			prev2=prev1;
			prev1=num;
		}
		System.out.println(prev1);
			}

}
