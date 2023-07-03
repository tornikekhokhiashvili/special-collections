package com.efimchick.ifmo.collections;

import java.util.*;
import java.util.stream.Collectors;

class MedianQueue extends AbstractQueue<Integer> {
    private final PriorityQueue<Integer> minHeap;
    private final PriorityQueue<Integer> maxHeap;
    MedianQueue(){
        minHeap=new PriorityQueue<>();
        maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    }
    @Override
    public Iterator<Integer> iterator() {
        List<Integer> elements = new ArrayList<>(size());
        elements.addAll(minHeap);
        elements.addAll(maxHeap);
        return elements.iterator();
    }

    @Override
    public int size() {
        return minHeap.size() + maxHeap.size();
    }

    @Override
    public boolean offer(Integer integer) {
        if (minHeap.isEmpty() || integer >= minHeap.peek()) {
            minHeap.offer(integer);
        } else {
            maxHeap.offer(integer);
        }

        if (minHeap.size() > maxHeap.size() + 1) {
            maxHeap.offer(minHeap.poll());
        } else if (maxHeap.size() > minHeap.size()) {
            minHeap.offer(maxHeap.poll());
        }

        return true;
    }

    @Override
    public Integer poll() {
        if (minHeap.isEmpty() && maxHeap.isEmpty()) {
            return null;
        }

        if (minHeap.size() > maxHeap.size()) {
            return minHeap.poll();
        } else {
            return maxHeap.poll();
        }
    }

    @Override
    public Integer peek() {
        if (minHeap.isEmpty() && maxHeap.isEmpty()) {
            return null;
        }

        if (minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        } else {
            return maxHeap.peek();
        }
    }

}
