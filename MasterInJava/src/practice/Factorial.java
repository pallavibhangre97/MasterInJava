package practice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i = 1;
		int fact = 1;
		while (i <= n) {

			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}

}
