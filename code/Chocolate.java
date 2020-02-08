package com.code;

import java.util.Scanner;

public class Chocolate{
	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);
			int no_of_choc, no_of_candy, i;
		    System.out.print("Enter no.of chocolates:");
		    no_of_choc=sc.nextInt();
		    String choc[] = new String[no_of_choc];
		    for(i=0;i<no_of_choc;i++) {
		    	System.out.println("Enter Chocolate name:");
		    	choc[i]=sc.next();
		    }  
		    System.out.print("Enter no.of candies:");
			no_of_candy=sc.nextInt();
			String candy[] = new String[no_of_candy];
			for(i=0;i<no_of_candy;i++) {
			    System.out.println("Enter Candy name:");
			    candy[i]=sc.next();	
		    }
			Sweet1 s1=new Sweet1();
			s1.sort(choc);
			Sweet2 s2=new Sweet2();
			s2.candies(candy);
			Sweet sw=new Sweet();
			sw.sweets(choc, candy);
			sc.close();
	}
}
    		
