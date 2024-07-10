package com.practice.datastructures.hashing;

import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.stream.IntStream;

// in order to guarantee all required methods are implemented, an Abstract interface is implemented
public class MyHash implements HashAbstract<Integer, String> {

    private ArrayList<MyEntry> entries;

    public MyHash() {
        // init the empty entries when an object instance is first created
        entries = new ArrayList<>();
    }

    @Override
    public void put(Integer key, String value) {
        // if this key already exists
        MyEntry existingEntry = this.get(key);
        if (existingEntry != null) {
            // overwrite the existing key value
            existingEntry.setValue(value);
            return;
        }

        // add the new key to the hash
        this.entries.add(new MyEntry(key, value));
    }

    @Override
    public MyEntry get(Integer key) {
        // use a stream to filter and return the first entry with this key, otherwise return null
        return this.entries.stream()
                .filter(entry -> entry.getKey() == key)
                .findFirst()
                .orElse(null);
    }

    @Override
    public MyEntry remove(Integer key) {
        // find the index of the first item that has this key... otherwise no index will be found
        OptionalInt optionalIndex = IntStream.range(0, this.entries.size())
                .filter(index -> this.entries.get(index).getKey() == key)
                .findFirst();

        // if there was no found index
        if (!optionalIndex.isPresent()) {
            return null;
        }

        // remove the entry at the found index position
        return this.entries.remove(optionalIndex.getAsInt());
    }

    @Override
    public boolean contains(String value) {
        // use a stream to filter and return the first entry with this value, otherwise return null
        MyEntry foundEntry = this.entries.stream()
            .filter(entry -> entry.getValue().equals(value))
            .findFirst()
            .orElse(null);

        // return true / false, was an entry with this value found?
        return foundEntry != null;
    }

    @Override
    public int size() {
        return this.entries.size();
    }

    @Override
    public boolean containsKey(Integer key) {
        // use a stream to filter and return the first entry with this key, otherwise return null
        MyEntry foundEntry = this.entries.stream()
            .filter(entry -> entry.getKey() == key)
            .findFirst()
            .orElse(null);

        // return true / false, was an entry with this key found?
        return foundEntry != null;
    }

}
