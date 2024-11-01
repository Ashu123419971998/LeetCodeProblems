package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSum2 {
    static List<List<Integer>> result=new ArrayList<>();
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(0,0,candidates,new ArrayList<>(),target);
        return result;
    }
    public static void backtrack(int sum, int i,int[] candidates,List<Integer> res, int target)
    {
        if(sum==target)
        {
            result.add(new ArrayList<>(res));
            return;
        }
        if(sum>target)
        {
            return;
        }
        for(int start=i;start<candidates.length;start++)
        {
            if(start>i && candidates[start]==candidates[start-1])
            {
                continue;
            }
            sum=sum+candidates[start];
            res.add(candidates[start]);
            backtrack(sum,start+1,candidates,res,target);
            sum=sum-res.get(res.size()-1);
            res.remove(res.size()-1);

        }
    }
    public static void main(String[] args) {
        int[] nums= new int[]{10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum2(nums,target));
    }
}
