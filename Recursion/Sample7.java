package Sample;

public class Sample7 {

	public static void main(String[] args) {
	Sample7 s=new Sample7();
	System.out.println(s.fibon(5));
	}
	int fibon(int n) {
		if(n<=1) {
			return n;
		}
		return fibon(n-1)+fibon(n-2);
	}
}
