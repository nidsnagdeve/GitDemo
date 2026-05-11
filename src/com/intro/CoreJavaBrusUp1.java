package com.intro;

import java.util.ArrayList;

public class CoreJavaBrusUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {5,6,7,8,9};
		
		System.out.println("First element is : " + numbers[0]);
		System.out.println("Last element is : " + numbers[numbers.length -1]);
		
		
		System.out.println("Elements in reverse order: ");
		for(int i = numbers.length-1; i>=0;  i--)
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("Total elements in the array " + numbers.length);
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("nidhi");
		a.add("nagdeve");
		a.add("academy");
		a.add("selenium");
		//System.out.println(a.get(3));
		
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("**************");
		for(String val : a)
		{
			System.out.println(val);
		}
		
		System.out.println(a.contains("selenium"));
	}

}
