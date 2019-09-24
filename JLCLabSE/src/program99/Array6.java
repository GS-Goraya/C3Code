//
package program99;
import java.util.HashSet;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int sorted[]= {1,2,3,4,5,6,7};
		 int unsorted[]= {1,4,6,3,2,7,5};
           HashSet<Integer> hs1= new HashSet<>();
           HashSet<Integer> hs2= new HashSet<>();
           for(int i=0;i<sorted.length;i++)
           {
        	   hs1.add(sorted[i]);
        	  hs2.add(unsorted[i]);   
           }
           for(int no:hs1)
           {
        	   System.out.println(no+"sorted array ");
           }
           for(int no2:hs2)
           {
        	   System.out.println(no2+"unsorted array");
           }
        	   
	}

}
