package leetcode.medium;

import java.util.HashSet;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int max_len=0;
        for(int num: set)
        {
            int len=1;
            //Finding if any number+1 is present in the array.
            if(!set.contains(num+1))
            {
                //Checking if possibility of sequence.
                if(set.contains(num-1))
                {
                    int temp=num-1;
                    while(set.contains(temp))
                    {
                        len++;
                        temp=temp-1;
                    }
                }
            }
            //In every iteration check max length.
            max_len=Math.max(max_len,len);
        }
        return max_len;
    }
    public static void main(String[] args) {
        int[] nums= new int[]{0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
