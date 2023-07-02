package com.efimchick.ifmo.collections;

import java.util.*;

class MedianQueue  {
    private Queue<Integer> queue;

    public MedianQueue() {
        queue = new PriorityQueue<>();
    }

    public void offer(int element) {
        queue.offer(element);
    }

    public int poll() {
        return queue.poll();
    }

    public int peek() {
        return queue.peek();
    }

    public Iterator<Integer> iterator() {
        return queue.iterator();
    }

    public int size() {
        return queue.size();
    }

    public int getMedian() {
        List<Integer> sortedList = new ArrayList<>(queue);
        Collections.sort(sortedList);
        int size = sortedList.size();
        int middle = size / 2;
        return sortedList.get(middle);
    }
}
