package Challenge_30Day;

import java.util.HashSet;

public class Day2_HappyNumber {
    HashSet<Integer> check = new HashSet<>();

    boolean isHappy(int n) {
        int sum = 0;
        if (check.contains(n)) return false;
        check.add(n);
        while (n != 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum == 1 || isHappy(sum);
    }

    public static void main(String[] args) {
        System.out.println(new Day2_HappyNumber().isHappy(19));
        System.out.println(new Day2_HappyNumber().isHappy(36));
    }
}
