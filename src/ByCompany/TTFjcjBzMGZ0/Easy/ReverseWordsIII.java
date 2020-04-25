package ByCompany.TTFjcjBzMGZ0.Easy;

public class ReverseWordsIII {
    private String reverseWords(String s) {
        if(s == null || s.length() <=1)
            return s;
        String str[] = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(String st: str) stringBuilder.append(" ").append(new StringBuilder(st).reverse());
        return stringBuilder.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(new ReverseWordsIII().reverseWords("Let's take LeetCode contest"));
    }
}
