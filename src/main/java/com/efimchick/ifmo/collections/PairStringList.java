package com.efimchick.ifmo.collections;

import java.util.*;

class PairStringList implements List<String> {
    private List<String> list;

    public PairStringList() {
        this.list = new ArrayList<>();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }

    @Override
    public boolean add(String s) {
       return list.add(s)&&list.add(s);
    }

    @Override
    public boolean remove(Object o) {
        int index = list.indexOf(o);
        if (index != -1) {
            list.remove(index);
            list.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        boolean modified = false;
        for (String element : c) {
            modified |= add(element);
        }
        return modified;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        int i = index * 2; // Adjust the index to account for pairs
        for (String s : c) {
            list.add(i, s);
            list.add(i + 1, s); // Add the pair as well
            i += 2; // Increment i by 2 to account for the added elements and their pairs
        }
        return !c.isEmpty();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public String get(int index) {
        return list.get(index*2+1);
    }

    @Override
    public String set(int index, String element) {
        String replacedElement = list.set(index * 2, element);
        list.set(index * 2 + 1, element);
        return replacedElement;
    }

    @Override
    public void add(int index, String element) {
        if (index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException();
        }
        list.add(index, element);
        list.add(index, element);
    }

    @Override
    public String remove(int index) {
        int actualIndex = index /2;
        String removedElement = list.remove(actualIndex);
        list.remove(actualIndex); // remove the pair element
        return removedElement;
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public ListIterator<String> listIterator() {
        return list.listIterator();
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return list.listIterator(index);
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }
}
