package Challenge_30Day;

public class Day1_SingleNumber {
    private int singleNumber(int[] nums) {
//        if(nums == null || nums.length == 0)
//            return -1;
//        Set<Integer> set = new HashSet<>();
//
//        for (int num: nums) {
//            if (set.contains(num)) {
//                set.remove(num);
//            } else {
//                set.add(num);
//            }
//        }
//        return (int) set.toArray()[0];

        int n = nums.length;
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Challenge_30Day.Day1_SingleNumber().singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(new Challenge_30Day.Day1_SingleNumber().singleNumber(new int[]{2, 2, 1}));
    }
}
