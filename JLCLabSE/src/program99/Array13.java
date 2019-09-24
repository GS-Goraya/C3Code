//Find element theat apperas once in array.?
// Same as Find duplicate element in array. little diff. in if statement

package program99;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] arr= {3,5,5,3,2,2,1,3};
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
			  if(me.getValue()==1)
			  {
				  System.out.println(me.getKey()+"");
			  }
		  }
		  
	}

}
