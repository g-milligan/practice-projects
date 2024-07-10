package com.practice.datastructures.hashing;

public interface MyEntryAbstract<T1, T2> {
    public abstract T1 getKey();
    public abstract void setKey(T1 key);
    
    public abstract T2 getValue();
    public abstract void setValue(T2 value);
}
