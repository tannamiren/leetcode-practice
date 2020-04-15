package Challenge_30Day;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Day12_LastStoneWeight {
    private int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone: stones)
            queue.offer(stone);

        while(queue.size() > 1) {
            int y = queue.poll();
            int x = queue.poll();

            if(y != x)
                queue.offer(y-x);
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }

    public static void main(String[] args) {
        System.out.println(new Day12_LastStoneWeight().lastStoneWeight(new int[]{2,7,4,1,8,1, 1}));
    }
}
