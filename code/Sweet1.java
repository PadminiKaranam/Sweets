package com.code;

public class Sweet1 {
	public void sort(String[] choc) {
		   int size=choc.length;
	       for(int i=0;i<size-1;i++) {
	    	   for(int j=i+1;j<choc.length;j++) {
	    		   if(choc[i].compareTo(choc[j])>0)
	    		   {
	    		   String temp=choc[i];
	    		   choc[i]=choc[j];
	    		   choc[j]=temp;
	    	   }
	    	   }
	       }
	   
		   for(int i=0;i<size;i++)
			   System.out.println(choc[i]);
	   }

}
