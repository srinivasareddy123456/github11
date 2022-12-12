package:java

import org.testng.mustache.StringChunk;

public class DoubleDimensionalArrayExample {
public static void main(String[] args) {
	
	//syntax:
	  //dataType arrayName[]=new dataType[size][size];
	  
	     String array1[][] = new String [2][2];
	      
	      array1[0][0] = "seLenium";
	     
	      array1[0][1] = "srini";
	      
	      array1[1][0] = "Manual Testing";
	      array1[1][1] = "Venkat Sir";
	      
	     //array1[1][2] = " Testing ";
	      
	    //System.out.println(array1[0][1]);
	     
	       for(int i=0;i<2;i++)
	    //for(int i=;<array1.Length;i++)
	    	  
	    	   
	      for(int j=0;j<2;j++)
	    	  
	    //for(int j=0;j<array1.Length;j++)
	      {
	    	 
	        System.out.print(array1[i][j]+" ");

	
}
	
	

	
	
	
	
}
