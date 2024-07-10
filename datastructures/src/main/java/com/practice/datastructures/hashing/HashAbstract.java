package com.practice.datastructures.hashing;

public interface HashAbstract<T1, T2> {
    public abstract void put(T1 key, T2 value);
    public abstract MyEntryAbstract<T1, T2> get(T1 key);
    public abstract MyEntryAbstract<T1, T2> remove(T1 key);
    public abstract boolean contains(T2 value);
    public abstract boolean containsKey(T1 key);
    public abstract int size();
}
