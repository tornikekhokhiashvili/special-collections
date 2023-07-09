package com.efimchick.ifmo.collections;

import java.util.*;

class PairStringList extends ArrayList<String> {

    @Override
    public boolean add(String str) {
        super.add(str);
        return super.add(str);
    }

    @Override
    public void add(int index, String element) {
        if (index % 2 == 0) {
            super.add(index, element);
            super.add(index, element);
        } else {
            super.add(index + 1, element);
            super.add(index + 1, element);
        }
    }


    @Override
    public boolean addAll(Collection<? extends String> c) {
        boolean isAdd = true;
        for (String s : c) {
            isAdd = add(s);
            if (isAdd == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        if (index % 2 == 0) {
            for (String s : c) {
                add(index, s);
                index += 2;
            }
        } else {
            for (String s : c) {
                add(++index, s);
                index += 1;
            }
        }
        return true;
    }

    @Override
    public boolean remove(Object str) {
        super.remove(str);
        return super.remove(str);
    }

    @Override
    public String remove(int index) {
        if (index % 2 == 0) {
            super.remove(index);
            return super.remove(index + 1);
        } else {
            super.remove(index);
            return super.remove(index - 1);
        }
    }

    @Override
    public String set(int index, String element) {
        if (index % 2 == 0) {
            super.set(index, element);
            return super.set(index + 1, element);
        } else {
            super.set(index, element);
            return super.set(index - 1, element);
        }
    }

    public int size() {
        return super.size();
    }
}