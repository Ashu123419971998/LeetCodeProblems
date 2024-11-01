package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    static List<List<Integer>> result=new ArrayList<>();
    public static List<List<Integer>> combine(int n, int k) {
        backtrack(1,new ArrayList<>(),k,n);
        return result;
    }

    public static void backtrack(int current,List<Integer> res,int k,int n)
    {
        if(res.size()==k)
        {
            result.add(new ArrayList<>(res));
            return;
        }
        while(current<=n)
        {
            //Adding the number to the list.
            res.add(current);
            backtrack(current+1,res,k,n);
            //Backtrack the list
            res.remove(res.size()-1);
            current++;
        }

    }
    public static void main(String[] args) {
        int n= 4;
        int k=2;
        System.out.println(combine(n,k));
    }
}
