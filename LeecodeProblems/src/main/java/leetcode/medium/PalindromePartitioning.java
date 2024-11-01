package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    static List<List<String>> result=new ArrayList<>();
    public static List<List<String>> partition(String s) {
        backTrack(s,0,new ArrayList<>());
        return result;
    }

    public static void backTrack(String s, int i, List<String> partition)
    {
        if(i>s.length()-1)
        {
            result.add(new ArrayList<>(partition));
            return;
        }

        for(int start=i;start<s.length();start++)
        {
            if(isPalindrom(s,i,start))
            {
                partition.add(s.substring(i,start+1));
                backTrack(s,start+1,partition);
                partition.remove(partition.size()-1);
            }

        }
    }

    static boolean isPalindrom(String s, int l, int r)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
       String s="aab";
        System.out.println(partition(s));
    }
}
