package leetcode.medium;
import java.util.*;
public class SubSets2 {
    static List<List<Integer>> res=new ArrayList<>();
    public static void backtrack(int[] nums, int i, int n, List<Integer> list )
    {
        res.add(new ArrayList<>(list));
        for(int start=i;start<n;start++)
        {
            if(start>i && nums[start]==nums[start-1]) continue;
            list.add(nums[start]);
            backtrack(nums,start+1,n,list);
            list.remove(list.size()-1);
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0,nums.length,new ArrayList<Integer>());
        return res;
    }
    public static void main(String[] args) {
        int[] nums= new int[]{1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
