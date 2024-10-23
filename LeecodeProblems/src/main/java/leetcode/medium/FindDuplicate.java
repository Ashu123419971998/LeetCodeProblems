package leetcode.medium;

import java.util.Arrays;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do
        {
            //Increments by 1 step
            slow=nums[slow];
            //Increments by 2 steps
            fast=nums[nums[fast]];
        }while(slow!=fast);

        slow=nums[0];

        //slow and fast both increment by 1
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] nums= new int[]{3,1,3,4,2};
        int res=findDuplicate(nums);
        System.out.println(res);
    }
}
