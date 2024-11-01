package leetcode.medium;

import java.util.*;

public class CombinationSum3 {
    static List<List<Integer>> result=new ArrayList<>();
    public static List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(1,k,n,new ArrayList<>(),0);
        return result;

    }

    public static void backTrack(int i,int k, int n, List<Integer> res,int sum)
    {
        if(res.size()>k)
        {
            return;
        }
        if(sum==n && res.size()==k)
        {
            result.add(new ArrayList<>(res));
        }
        while(i>=1 && i<=9)
        {
            sum=sum+i;
            res.add(i);
            backTrack(i+1,k,n,res,sum);
            sum=sum-res.get(res.size()-1);
            res.remove(res.size()-1);
            i++;
        }
    }

    public static void main(String[] args) {
        int n= 3;
        int k=7;
        System.out.println(combinationSum3(n,k));
    }
}
