// Find the duplicates number in array .?
//  Best way is to use Hashtable.
// First ,we will check the element is in hashmap. if not then put element in hashmap.
// if element is already avaible then , increment the count and put in hashtbale.
//  now wwe will find duplicate , by using set interface bcz it not include duplicate value.
// we wil create set inface object and then use to for each loop for all element .
// then  get value and compare with 1 if greater then print that element is duplicate.
package program99;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Array2 {
  public static void main(String args[])
  {
	  int [] arr= {3,5,4,3,2,2,1,3};
	  Map<Integer,Integer> hm=new HashMap<Integer, Integer>();
	  for(int no:arr)
	  {
		  Integer count =hm.get(no);
		  if(count==null)
		  {
			 hm.put(no, 1);
			 
		  }
		  else
		  {
			  count=count+1;
			  hm.put(no,count);
		  }
	  }
	  System.out.print("Duplicate elements are"+" ");
	  Set<Map.Entry<Integer,Integer>>es=hm.entrySet();
	  for(Map.Entry<Integer,Integer>me:es)
	  {
		  if(me.getValue()>1)
		  {
			  System.out.println(me.getKey()+"");
		  }
	  }
	  
  }
}
