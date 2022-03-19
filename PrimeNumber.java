package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
	int i,j=0,inp=2;
	boolean flag = false;
	j = inp/2;
	for (i=2;i<=j; i++) {
		j = inp%i;	
		if (j==0) {
			 flag = true;
		}
	}
	if (j != 0) {
		System.out.println("Is a Prime Number");
		System.out.println(flag);
	}
	else {
		System.out.println("Not a Prime Number");
	}
}
}
