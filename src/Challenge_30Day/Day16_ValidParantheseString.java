package Challenge_30Day;

import java.util.Stack;

public class Day16_ValidParantheseString {
    private boolean checkValidString(String s) {
        int min=0, max=0;
        for(char c: s.toCharArray()) {
            max += (c == '(' || c=='*')? 1: -1;
            min += (c == ')' || c=='*')? -1: 1;
            if(max < 0) return false;
            min = Math.max(min, 0);
        }
        return min ==0;
    }

    public static void main(String[] args) {
        System.out.println(new Day16_ValidParantheseString().checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
        System.out.println(new Day16_ValidParantheseString().checkValidString("*()(())*()(()()((()(()()*)(*(())((((((((()*)(()(*)"));
        System.out.println(new Day16_ValidParantheseString().checkValidString(")"));
        System.out.println(new Day16_ValidParantheseString().checkValidString("()"));
        System.out.println(new Day16_ValidParantheseString().checkValidString("(*)"));
        System.out.println(new Day16_ValidParantheseString().checkValidString("(*))"));
        System.out.println(new Day16_ValidParantheseString().checkValidString("(((******))"));
    }
}
