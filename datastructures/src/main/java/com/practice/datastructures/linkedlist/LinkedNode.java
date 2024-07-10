package com.practice.datastructures.linkedlist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinkedNode {
    public String value;
    public LinkedNode next;

    public LinkedNode(String val) {
        this.value = val;
    }

    @Override
    public String toString() {
        return String.format("value=%s, id=%s", this.value, this.hashCode());
    }
}
