package Sample;

public class Sample1 {

	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.num(1,6);
	}

 void num(int i,int n){
	if(i>n){
		return; 
	}
	System.out.println(i);
	num(i+1,n);
}
}
