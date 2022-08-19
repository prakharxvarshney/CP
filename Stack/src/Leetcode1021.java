import java.util.Stack;

public class Leetcode1021 {
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(') {
                if(stack.size()>0) {
                    ans.append(s.charAt(i));
                }
                stack.push(s.charAt(i));
            }
            else {
                stack.pop();
                if(stack.size()>0) {
                    ans.append(s.charAt(i));
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "()()";
        System.out.println(removeOuterParentheses(s));
    }
}
