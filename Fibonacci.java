package week1.day1;

public class Fibonacci {
	
	public static void main(String[] args) {
	int fi=0; int s=1; int sum;
	
	System.out.println(fi);
	
	for (fi=0; fi<=8; fi++) {
		sum= fi+s; 
		fi = s;
		s = sum;
		System.out.println(sum);
}
}
}
