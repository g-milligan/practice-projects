package com.practice.datastructures.hashing;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class MyEntry implements MyEntryAbstract<Integer, String> {

    private Integer key;
    private String value;

    @Override
    public Integer getKey() {
        return this.key;
    }

    @Override
    public void setKey(Integer key) {
        this.key = key;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        // this string format helps with debugging unit test assertions
        return String.format("{key:%d, value:%s}", this.key, this.value);
    }
    
}
