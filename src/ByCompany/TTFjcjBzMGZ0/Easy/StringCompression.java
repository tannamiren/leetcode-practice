package ByCompany.TTFjcjBzMGZ0.Easy;

public class StringCompression {

    private int compress(char[] chars) {
        if (chars == null || chars.length == 0)
            return 0;

        int index = 0, n = chars.length, i = 0;
        while (i < n) {
            char ch = chars[i];
            int j = i;
            while (j < n && chars[i] == chars[j]) { // chars[i..j - 1] are ch.
                j++;
            }
            int freq = j - i; // The frequency of ch.
            chars[index++] = ch;
            if (freq == 1) {
                // do nothing
            }
            else if (freq < 10) {
                chars[index++] = (char)(freq + '0');
            }
            else {
                String strFreq = String.valueOf(freq);
                for (char chFreq : strFreq.toCharArray())
                    chars[index++] = chFreq;
            }
            i = j;
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println(new StringCompression().compress(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'}));
        System.out.println(new StringCompression().compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println(new StringCompression().compress(new char[]{'a'}));
        System.out.println(new StringCompression().compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }
}
