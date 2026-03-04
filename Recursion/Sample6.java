package Sample;

public class Sample6 {

	public static void main(String[] args) {
		Sample6 s=new Sample6();
		System.out.println(s.reverse("hello",1));
	}
	String reverse(String s,int n){
		if(n>s.length()) {
			return "";
		}
	char c=s.charAt(s.length()-n);
	return c+reverse(s,n+1);
	}
}
