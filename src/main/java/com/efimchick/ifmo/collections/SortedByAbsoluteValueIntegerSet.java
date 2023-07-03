package com.efimchick.ifmo.collections;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

class SortedByAbsoluteValueIntegerSet extends AbstractSet<Integer> {
    private TreeSet<Integer> set;

    public SortedByAbsoluteValueIntegerSet() {
        this.set = new TreeSet<>(Comparator.comparingInt(Math::abs));
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return set.iterator();
    }

    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    public boolean add(Integer integer) {
        return set.add(integer);
    }

    @Override
    public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return set.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return set.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return set.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return set.spliterator();
    }

    @Override
    public Stream<Integer> stream() {
        return set.stream();
    }

    @Override
    public Stream<Integer> parallelStream() {
        return set.parallelStream();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        set.forEach(action);
    }
}
