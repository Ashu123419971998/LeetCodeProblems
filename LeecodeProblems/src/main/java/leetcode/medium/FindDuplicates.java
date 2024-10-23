package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<Integer>();

        //Iterating and converting +ve numbers to -ve in the index of nums[i].
        for(int i=0;i<nums.length;i++)
        {
            int position=Math.abs(nums[i]);
            if(nums[position-1]>0)
            {
                nums[position-1]=-1*nums[position-1];
            }
            //This means we already encountered this nums[i] before as
            //the numbers in position nums[i] is -ve.
            else
            {
                res.add(Math.abs(nums[i]));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums= new int[]{4,3,2,7,8,2,3,1};
        List<Integer> res=findDuplicates(nums);
        System.out.println(res);
    }
}
