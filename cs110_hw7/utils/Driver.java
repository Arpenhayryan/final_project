package utils;
import utils.Math;
import utils.ArrayUtils;
import Animals.Puppy;

public class Driver {

	public static void main(String[] args) {
		Puppy one = new Puppy("Joe");
		Puppy two = new Puppy("Chandler");
		Puppy three = new Puppy("Ross");
		
		one.getName();
		two.getName();
		three.getName();
	
		double u = 15.4;
		int n = (int)u;
		long fact = Math.factorialLoop(n);
		System.out.println(fact);
		
		int[] arr = {9, 20, 3, 44, 88, 300};
		int[] revarr = ArrayUtils.reverse(arr);
		System.out.println(revarr[0]+", "+revarr[1]+", "+revarr[2]+", "+revarr[3]+", "+revarr[4]+", "+revarr[5]);
		String[] str = {"Bane", "Batman", "Robin", "Gordon", "Oracle", "Catwoman"};
		String[] strarr = ArrayUtils.stringifyArray(str, arr);
		System.out.println(strarr[0]+", "+strarr[1]+", "+strarr[2]+", "+strarr[3]+", "+strarr[4]+", "+strr[5]);
	
	
	}
	
	
	
}
