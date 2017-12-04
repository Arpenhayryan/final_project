package utils;

public class Math {
	public static void main(String args[]){
		int a = 5;
		int c = 4;
	int fact = factorial(a);
	System.out.println(fact);
	int factwithloop = factorialLoop(c);
	System.out.println(factwithloop);
}
public static int factorial(int n) { 
	
    if (n <= 0) return 1; 
    return n * factorial(n-1); 
} 
public static int factorialLoop(int c) {
	int fact = 1;
	for(int i=1; i<=c; i++) {
		fact*=i;
	}
	return fact;
}
}




