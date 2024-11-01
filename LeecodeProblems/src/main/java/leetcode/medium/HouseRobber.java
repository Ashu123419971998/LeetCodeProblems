package leetcode.medium;

public class HouseRobber {
    public static int rob(int[] nums) {

        int r=0;
        int s=0;
        int c=0;
        int i=0;

        while(i<nums.length)
        {
            c=r+nums[i];
            r=s;
            s=Math.max(s,c);
            i++;
        }
        return s;
    }
    public static void main(String[] args) {
        int[] nums= new int[]{2,7,9,3,1};
        System.out.println(rob(nums));
    }
}
