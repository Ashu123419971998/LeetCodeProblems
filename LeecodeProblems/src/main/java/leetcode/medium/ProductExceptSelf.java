package leetcode.medium;
import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        result[0]=1;
        //Finding left product to the i
        for(int i=1;i<nums.length;i++)
        {
            result[i]=result[i-1]*nums[i-1];
        }
        int right_product=1;
        //Finding right product to the i
        for(int i=nums.length-1;i>=0;i--)
        {
            result[i]=result[i]*right_product;
            right_product=right_product*nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums= new int[]{-1,1,0,-3,3};
        int[] res=productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }
}
