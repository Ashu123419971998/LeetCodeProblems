package leetcode.medium;
import java.util.*;
public class SubSets {
    static List<List<Integer>> result=new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> res=new ArrayList<>();
        dfs(nums,0,nums.length,res);
        return result;
    }
    public static void dfs(int[] nums, int i, int len,List<Integer> res)
    {
        result.add(new ArrayList<>(res));
        for(int start=i;start<len;start++)
        {
            res.add(nums[start]);
            dfs(nums,start+1,len,res);
            res.remove(res.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums= new int[]{1,2,3};
        System.out.println(subsets(nums));
    }
}
