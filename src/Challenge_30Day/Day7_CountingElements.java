package Challenge_30Day;

import java.util.HashSet;

public class Day7_CountingElements {
    private int countElements(int[] arr) {
        if(arr == null || arr.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();
        for(int num: arr)
            set.add(num);
        int count = 0;
        for(int num: arr)
            if(set.contains(num + 1)) count ++;

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Day7_CountingElements().countElements(new int[]{1,2,3}));
        System.out.println(new Day7_CountingElements().countElements(new int[]{1,1,3,3,5,5,7,7}));
        System.out.println(new Day7_CountingElements().countElements(new int[]{1,3,2,3,5,0}));
        System.out.println(new Day7_CountingElements().countElements(new int[]{1,1,2,2}));
    }
}
