package Sample;

public class Sample2 {

	public static void main(String[] args) {
		
		Sample2 s=new Sample2();
		s.countDown(10);
	}
	void countDown(int n){
		if(n<=0) {
			return;
		}
		System.out.println(n);
		countDown(n-1);
	}
}
