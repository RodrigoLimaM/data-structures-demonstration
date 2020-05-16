package example;

import util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        //enqueing
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        //dequeing
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }
}