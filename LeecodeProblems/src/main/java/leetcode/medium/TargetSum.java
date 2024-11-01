package leetcode.medium;

import java.util.HashMap;

public class TargetSum {
    public static int findTargetSumWays(int[] nums, int target) {
        HashMap<Integer,Integer> sum_counts=new HashMap<>();
        sum_counts.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            HashMap<Integer,Integer> temp_sum_counts=new HashMap<>();
            for(Integer sum:sum_counts.keySet())
            {
                int count=sum_counts.get(sum);
                temp_sum_counts.put(sum+nums[i],temp_sum_counts.getOrDefault(sum+nums[i],0)+count);
                temp_sum_counts.put(sum-nums[i],temp_sum_counts.getOrDefault(sum-nums[i],0)+count);

            }
            sum_counts=temp_sum_counts;
        }
        return  sum_counts.getOrDefault(target,0);
    }
    public static void main(String[] args) {
        int[] nums= new int[]{1,1,1,1,1};
        int target=3;
        System.out.println(findTargetSumWays(nums,target));
    }

}
