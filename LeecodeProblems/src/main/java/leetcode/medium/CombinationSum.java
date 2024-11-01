package leetcode.medium;
import java.util.ArrayList;
import java.util.List;
public class CombinationSum {
    static List<List<Integer>> result=new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            sum=sum+candidates[start];
            res.add(candidates[start]);
            backtrack(sum,start,candidates,res,target);
            sum=sum-res.get(res.size()-1);
            res.remove(res.size()-1);

        }
    }

    public static void main(String[] args) {
        int[] nums= new int[]{2,3,6,7};
        int target=7;
        System.out.println(combinationSum(nums,target));
    }
}
