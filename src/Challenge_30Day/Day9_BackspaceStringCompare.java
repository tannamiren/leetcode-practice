package Challenge_30Day;

import java.util.Stack;

public class Day9_BackspaceStringCompare {
    private boolean backspaceCompare(String S, String T) {
        if(S == null || T == null || S.length() == 0 || T.length() == 0)
            return false;

        Stack<Character> stringStack = new Stack<>();
        for(char c: S.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                stringStack.add(c);
            else if(!stringStack.isEmpty() && c == '#')
                stringStack.pop();
        }
        Stack<Character> stringStack2 = new Stack<>();
        for(char c: T.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                stringStack2.add(c);
            else if(!stringStack2.isEmpty() && c == '#')
                stringStack2.pop();
        }
        if(stringStack.size() == stringStack2.size()) {
            while(!stringStack.isEmpty()) {
                if(stringStack.pop() != stringStack2.pop()) return false;
            }
            return true;
        } else return false;

    }

    public static void main(String[] args) {
        System.out.println(new Day9_BackspaceStringCompare().backspaceCompare("ab#c", "ad#c"));
        System.out.println(new Day9_BackspaceStringCompare().backspaceCompare("ab##", "c#d#"));
        System.out.println(new Day9_BackspaceStringCompare().backspaceCompare("a##c", "#a#c"));
        System.out.println(new Day9_BackspaceStringCompare().backspaceCompare("a#c", "b"));
    }
}
