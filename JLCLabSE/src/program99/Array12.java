// Find First duplicate element in Array .?
// Best way to use HashSet
// Fiest we will travese array from last to first index
//  then check element it conatin in hashset or not .
// if contain then increment temp var.
// not contain then add element in hashset.
// then print temp .
package program99;

import java.util.HashSet;

public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int temp=-1;
      int a[]= {6,5,2,3,4,5,7,4};
      HashSet<Integer> hs= new HashSet();
      for(int i=a.length-1;i>=0;i--)
      {
    	  if(hs.contains(a[i]))
    	  {
    		  temp=i;
    		  
    	  }
    	  else
    	  {
    		  hs.add(a[i]);
    	  }
    	  
      }
      if(temp!=-1)
      {
      System.out.print("First Duplicate element"+a[temp]);
      }
	}

}
