package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
	
	int[] age= {20,30,40,50,28};
		
		System.out.println("First Index Value :"+ age[3]);
		
	int arraylength = age.length; 
	
	System.out.println("Total Length of the Array :"+arraylength);
	
	System.out.println("Last Index Value :"+age[arraylength-1]);
	
	Arrays.sort(age);
	
	System.out.println("after sort the last value :"+age[arraylength-1]);
	
		
	for (int i=0; i< age.length; i++) {
		System.out.println(age[i]);
	}

	}

}
