package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    static List<String> result=new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        backTrack(n,0,0,new Stack<>());
        return result;
    }

    public static void backTrack(int n, int open,int close, Stack<String> stack)
    {
        if(open== n && close ==n)
        {
            String res="";
            for(String string: stack)
            {
                res=res+string;
            }
            result.add(res);
            return;
        }

        if(open<n)
        {
            stack.push("(");
            backTrack(n,open+1,close,stack);
            stack.pop();
        }
        if(close<open)
        {
            stack.push(")");
            backTrack(n,open,close+1,stack);
            stack.pop();
        }

    }
    public static void main(String[] args) {
        int n= 3;
        System.out.println(generateParenthesis(n));
    }
}
