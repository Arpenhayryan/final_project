package utils;

public class ArrayUtils {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		String[] str = {"Bob", "Cat", "Mr. Nobody"};
		int[] revarr = reverse(arr);
		System.out.println(revarr[0]+", "+revarr[1]+", "+revarr[2]);
		String[] res = stringifyArray(str, arr);
		System.out.println(res[0]+", "+res[1]+", "+res[2]);
	}
	
    public static int[] reverse(int[] arr1) {
    	int[] arr2 = new int[arr1.length];
    	for(int i = 0; i < arr1.length; i++){
    		arr2[i]=arr1[arr1.length-1-i];
    		 }
		return arr2;
		 }
    
    public static String[] stringifyArray (String[] str, int[] arr){
    	String[] str1 = new String[arr.length];
    	for(int i = 0; i<arr.length; i++) {
		str1[i] = str[i]+ " " +arr[i];
    	}
    return str1;
}
}

