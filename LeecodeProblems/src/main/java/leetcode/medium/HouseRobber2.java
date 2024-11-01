package leetcode.medium;

public class HouseRobber2 {
    public static int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int r=0;
        int c=0;
        int s=0;
        int i=1;
        while(i<nums.length)
        {
            c=r+nums[i];
            r=s;
            s=Math.max(s,c);
            i++;
        }
        int temp=s;
        r=0;
        c=0;
        s=0;
        i=0;
        while(i<nums.length-1)
        {
            c=r+nums[i];
            r=s;
            s=Math.max(s,c);
            i++;
        }
        if(temp>s)
        {
            return temp;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] nums= new int[]{2,3,2};
        System.out.println(rob(nums));
    }
}
