package com.practice.datastructures.hashing;

public class HashingAnswer {
    private class Entry {
        int key;
        int value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry[] table;
    private int capacity;

    public HashingAnswer(int capacity) {
        this.capacity = capacity;
        this.table = new Entry[capacity];
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void put(int key, int value) {
        int hash = hash(key);
        Entry newEntry = new Entry(key, value);
        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry current = table[hash];
            Entry prev = null;
            while (current != null) {
                if (current.key == key) {
                    current.value = value;
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newEntry;
        }
    }

    public int get(int key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return -1;
        } else {
            Entry current = table[hash];
            while (current != null) {
                if (current.key == key) {
                    return current.value;
                }
                current = current.next;
            }
            return -1;
        }
    }

    public void remove(int key) {
        int hash = hash(key);
        if (table[hash] != null) {
            Entry current = table[hash];
            Entry prev = null;
            while (current != null) {
                if (current.key == key) {
                    if (prev == null) {
                        table[hash] = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    return;
                }
                prev = current;
                current = current.next;
            }
        }
    }
}
