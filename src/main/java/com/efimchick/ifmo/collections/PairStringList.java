package com.efimchick.ifmo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class PairStringList  {
    private ArrayList<String> list;

    public PairStringList() {
        list = new ArrayList<>();
    }

    public void add(String element) {
        list.add(element);
        list.add(element);
    }

    public void add(int index, String element) {
        if (index >= 0 && index <= list.size()) {
            list.add(index, element);
            list.add(index + 1, element);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void remove(String element) {
        while (list.contains(element)) {
            list.remove(element);
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            list.remove(index); // Removes the pair
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public String get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void set(int index, String element) {
        if (index >= 0 && index < list.size()) {
            list.set(index, element);
            list.set(index + 1, element); // Updates the pair
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void addAll(Collection<String> collection) {
        for (String element : collection) {
            add(element);
        }
    }

    public void addAll(int index, Collection<String> collection) {
        if (index >= 0 && index <= list.size()) {
            int i = index;
            for (String element : collection) {
                list.add(i++, element);
                list.add(i++, element);
            }
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public Iterator<String> iterator() {
        return list.iterator();
    }

    public int size() {
        return list.size() / 2;
    }
}
