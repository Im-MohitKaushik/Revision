package com.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student's Article");
		String article= sc.nextLine();
		
		String[] str= article.split("[, ; : . ? !]");
		
	
		List<String> list = new ArrayList<>();

	
		for(String s:str) {
			if(!s.equals(""))
				list.add(s.toLowerCase());
		}
		
		System.out.println("Number of Words :"+list.size());
		
		TreeSet<String> ts= new TreeSet<>(list);
		
		System.out.println("Number of unique words :"+ts.size());
		
		System.out.println("The Words are :");
		int count=1;
		for(String s:ts) {
			System.out.println((count++)+". " +s );
		}
		
		
		
		
		
		
	}

}
