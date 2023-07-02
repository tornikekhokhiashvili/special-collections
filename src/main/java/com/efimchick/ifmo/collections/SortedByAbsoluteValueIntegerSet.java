package com.efimchick.ifmo.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class SortedByAbsoluteValueIntegerSet {
    private TreeSet<Integer> set;

    public SortedByAbsoluteValueIntegerSet() {
        set = new TreeSet<>(Comparator.comparingInt(Math::abs));
    }

    public void add(int element) {
        set.add(element);
    }

    public void remove(int element) {
        set.remove(element);
    }

    public boolean contains(int element) {
        return set.contains(element);
    }

    public void addAll(Collection<Integer> collection) {
        set.addAll(collection);
    }

    public Iterator<Integer> iterator() {
        return set.iterator();
    }
}
