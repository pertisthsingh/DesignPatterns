package Collections;

import java.util.*;

public class JavaQueueCollection {
    public Queue<Integer> createQueue(int ...args) {
        Queue<Integer> que = new LinkedList<>();
        for(int i : args) {
            que.add(i);
        }
        return que;
    }

    public Deque<Integer> createDeque(int ...args) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i : args) {
            deque.add(i);
        }
        return deque;
    }

    public PriorityQueue<Integer> createPriorityQueue(int ...args) {
        PriorityQueue<Integer> pQue = new PriorityQueue<>((a,b) -> b - a);
        for(int i : args) {
            pQue.add(i);
        }
        return pQue;
    }
}
