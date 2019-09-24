//Find the All pairs with given sum in an array.
package program99;

import java.util.*;

public class Array5 {
 
	public static int[] twosum(int[] nums, int target)
	{
		Map<Integer,Integer>numMap=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			numMap.put(nums[i], i);
		}
		
		for(int i=0; i<=nums.length;i++)
		{
			int numToFind=target-nums[i];
			if(numMap.containsKey(numToFind)&& numMap.get(numToFind)!=i)
			{
				return new int[]{i,numMap.get(numToFind)};
			}
			//throw new IllegalArgumentException("No pairs is Find");
		}
		return nums;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []  nums= {2,7,11,15};
      int target =18;
      System.out.println(Arrays.toString(twosum(nums,target)));
     
		
	}

}
