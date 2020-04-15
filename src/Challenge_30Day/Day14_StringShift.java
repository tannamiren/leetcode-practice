package Challenge_30Day;

public class Day14_StringShift {
    private String stringShift(String s, int[][] shift) {
        if(s == null || s.length() == 0) return s;

        int left =0, right=0;
        for(int sh[]: shift) {
            if(sh[0] == 0) left += sh[1];
            else right += sh[1];
        }
        if(Math.abs(left) == Math.abs(right)) return s;
        if(left > right && (Math.abs(left) - Math.abs(right)) % s.length() == 0) return s;
        if(left < right && (Math.abs(right) - Math.abs(left)) % s.length() == 0) return s;
        if(left > right) {
            left = left-right > s.length()? (left-right) % s.length(): left-right;
            StringBuilder stringBuilder = new StringBuilder(s);
            return stringBuilder.substring(left)
                    .concat(stringBuilder.substring(0, left));
        } else {
            right = right - left > s.length()? (right - left) % s.length() : right - left;
            StringBuilder stringBuilder = new StringBuilder(s);
            return stringBuilder.substring(s.length() - right)
                    .concat(stringBuilder.substring(0, s.length() - right));
        }
    }

    public static void main(String[] args) {
        System.out.println(new Day14_StringShift()
                .stringShift("abc", new int[][]{{0, 1}, {1, 2}}));
        System.out.println();
        System.out.println(new Day14_StringShift()
                .stringShift("abcdefg", new int[][]{{1, 1}, {1, 1},
                        {0, 2}, {1, 3}}));
        System.out.println();
        System.out.println(new Day14_StringShift().stringShift("wpdhhcj",
                new int[][]{{0,7},{1,7},{1,0},{1,3},{0,3},{0,6},{1,2}}));
        System.out.println();
        System.out.println(new Day14_StringShift().stringShift("yisxjwry",
                new int[][]{{1,8},{1,4},{1,3},{1,6},{0,6},{1,4},{0,2},{0,1}}));
    }
}
