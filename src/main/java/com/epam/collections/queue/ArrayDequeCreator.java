package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> cards = new ArrayDeque<>();
        ArrayDeque<Integer> firstDequeue = new ArrayDeque<>(firstQueue);
        ArrayDeque<Integer> secondDequeue = new ArrayDeque<>(secondQueue);

        Integer card1 = firstDequeue.poll();
        if (card1 != null) {
            cards.offer(card1);
        }
        Integer card2 = firstDequeue.poll();
        if (card2 != null) {
            cards.offer(card2);
        }
        Integer card3 = secondDequeue.poll();
        if (card3 != null) {
            cards.offer(card3);
        }
        Integer card4 = secondDequeue.poll();
        if (card4 != null) {
            cards.offer(card4);
        }
        while (firstDequeue.size() != 0 && secondDequeue.size() != 0) {
            firstDequeue.add(Objects.requireNonNull(cards.pollLast()));
            cards.addLast(Objects.requireNonNull(firstDequeue.pollFirst()));
            cards.addLast(Objects.requireNonNull(firstDequeue.pollFirst()));

            secondDequeue.add(Objects.requireNonNull(cards.pollLast()));
            cards.addLast(Objects.requireNonNull(secondDequeue.pollFirst()));
            cards.addLast(Objects.requireNonNull(secondDequeue.pollFirst()));
        }
        return cards;
    }
}
