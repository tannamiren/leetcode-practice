package Challenge_30Day;

import java.util.Arrays;

public class Day15_ProductOfArrayExceptSelf {
    private int[] productExceptSelf(int[] nums) {
        int L[] = new int[nums.length];
        int R[] = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            if(i==0) {
                L[0] = 1;
                R[nums.length - 1] = 1;
            } else {
                L[i] = L[i - 1] * nums[i - 1];
                R[nums.length - i - 1] = R[nums.length - i] * nums[nums.length - i];
            }
        }
        for (int i=0; i<nums.length; i++) {
            nums[i] = L[i] * R[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Day15_ProductOfArrayExceptSelf()
                        .productExceptSelf(
                                new int[]{1, 2, 3, 4})));
    }
}
