package com.practice.datastructures.linkedlist;


public class ReverseLinkedList {
    
    // note, the "head" LinkedNode is the first node in the list
    public LinkedNode ReverseTheList(LinkedNode head) {
        // Example: a -> b -> c -> d
        // Result: d -> c -> b -> a

        LinkedNode prev = null;
        LinkedNode curr = head; 

        // loop through each linked item
        while (curr != null) {
            LinkedNode nextTemp = curr.getNext(); 
            // set the "next" pointer to the previous item
            curr.setNext(prev); 
            prev = curr;

            // progress to the next item
            curr = nextTemp; 
        }

        return prev;
    }
}
