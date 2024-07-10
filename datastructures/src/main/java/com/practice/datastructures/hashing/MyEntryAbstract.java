package com.practice.datastructures.hashing;

/* 
* this interface defines what methods are required by classes that implement it.
* T1 and T2 are generic data types that can be substituted 
* by other types in classes that implement this abstract interface.
*/
public interface MyEntryAbstract<T1, T2> {
    public abstract T1 getKey();
    public abstract void setKey(T1 key);
    
    public abstract T2 getValue();
    public abstract void setValue(T2 value);
}
