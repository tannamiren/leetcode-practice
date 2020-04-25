package ByCompany.TTFjcjBzMGZ0.Easy;

import java.util.ArrayDeque;

public class MovingAverage {

    ArrayDeque<Integer> queue;
    int size;
    double current = 0;

    /**
     * Initialize your data structure here.
     */
    private MovingAverage(int size) {
        queue = new ArrayDeque<>(size);
        this.size = size;
    }

    private double next(int val) {
        current = current + val - (queue.size() >= size ? queue.poll() : 0);
        queue.offer(val);
        return current / queue.size();
    }

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);

        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));
    }
}
