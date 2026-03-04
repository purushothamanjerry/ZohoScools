package Sample;

public class Sample4 {

	public static void main(String[] args) {
		System.out.println(sum(1,3));
	}
	static int sum(int n,int m) {
	if(n>m) {
		return 0;
	}
	return m+sum(n,m-1);
	}
}
