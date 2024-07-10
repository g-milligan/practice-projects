package com.practice.datastructures.hashing;

import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MyHash implements HashAbstract<Integer, String> {

    private ArrayList<MyEntry> entries;

    public MyHash() {
        entries = new ArrayList<>();
    }

    @Override
    public void put(Integer key, String value) {
        // if this key already exists
        MyEntry existingEntry = this.get(key);
        if (existingEntry != null) {
            existingEntry.setValue(value);
            return;
        }

        this.entries.add(new MyEntry(key, value));
    }

    @Override
    public MyEntry get(Integer key) {
        return this.entries.stream()
                .filter(entry -> entry.getKey() == key)
                .findFirst()
                .orElse(null);
    }

    @Override
    public MyEntry remove(Integer key) {
        OptionalInt optionalIndex = IntStream.range(0, this.entries.size())
                .filter(index -> this.entries.get(index).getKey() == key)
                .findFirst();

        if (!optionalIndex.isPresent()) {
            return null;
        }

        return this.entries.remove(optionalIndex.getAsInt());
    }

    @Override
    public boolean contains(String value) {
        MyEntry foundEntry = this.entries.stream()
            .filter(entry -> entry.getValue().equals(value))
            .findFirst()
            .orElse(null);
        return foundEntry != null;
    }

    @Override
    public int size() {
        return this.entries.size();
    }

    @Override
    public boolean containsKey(Integer key) {
        MyEntry foundEntry = this.entries.stream()
            .filter(entry -> entry.getKey() == key)
            .findFirst()
            .orElse(null);
        return foundEntry != null;
    }

}
