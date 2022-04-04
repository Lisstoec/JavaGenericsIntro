package com.JavaGenericsIntro;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private List<T> items;

    public GenericList() {
        this.items = new ArrayList<>();
    }

    public void addItem(T object) {
        this.items.add(object);
    }

    public T getItem(int index) {
        return this.items.get(index);
    }

    public T removeItem(int index) {
        return this.items.remove(index);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public String toString() {
        String output = "\n";
        for (int i = 1; i < items.size(); i++) {
            output += items.get(i).toString();
            if (i + 1 < items.size()) output += ", ";
        }
        output += ".";
        return output;

    }
}