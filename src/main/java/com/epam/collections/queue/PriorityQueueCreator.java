package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        PriorityQueue<String> queue = new PriorityQueue<>(reverseComparator);
        List<String> strings = new ArrayList<>();
        strings.addAll(firstList);
        strings.addAll(secondList);
        Collections.sort(strings);
        for (String s:strings) {
            queue.offer(s);
        }
        return queue;
    }
}
