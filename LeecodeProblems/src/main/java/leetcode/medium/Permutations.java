package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static List<List<Integer>> result=new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> holder = new ArrayList<>();
        for (int num : nums) {
            holder.add(num);
        }
        //Holder will hold all the elements remaining
        dfs(new ArrayList<>(),holder);
        return result;
    }
    public static void dfs( List<Integer> res, List<Integer> holder)
    {
        //If the holder length is 1 then it is a combination, add to result.
        if(holder.size()==1)
        {
            res.add(holder.get(0));
            result.add(new ArrayList<>(res));
            return;
        }
        //Select one by one elements in holder.
        for(int i=0;i<holder.size();i++)
        {
            List<Integer> res_temp=new ArrayList<>(res);
            List<Integer> holder_temp=new ArrayList<>(holder);
            res_temp.add(holder.get(i));
            holder_temp.remove(i);
            dfs(res_temp,holder_temp);
        }
    }
    public static void main(String[] args) {
        int[] nums= new int[]{1,2,3};
        System.out.println(permute(nums));
    }
}
