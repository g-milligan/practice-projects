package com.practice.datastructures.heap;

/**
 * MinHeap class implements a binary min heap.
 * Provides methods for insertion, deletion, and heap property maintenance.
 */
public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    /**
     * Constructor for MinHeap.
     * @param maxSize the maximum size of the heap
     */
    public MinHeap(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize must be positive");
        }
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[this.maxSize + 1];
        this.heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return 2 * pos;
    }

    private int rightChild(int pos) {
        return 2 * pos + 1;
    }

    private void swap(int fpos, int spos) {
        int tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    private void heapify(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return;
        }

        int left = leftChild(pos);
        int right = rightChild(pos);

        // Check if children are within the bounds
        if (left <= size && right <= size) {
            if (heap[pos] > heap[left] || heap[pos] > heap[right]) {
                if (heap[left] < heap[right]) {
                    swap(pos, left);
                    heapify(left);
                } else {
                    swap(pos, right);
                    heapify(right);
                }
            }
        } else if (left <= size && heap[pos] > heap[left]) {
            swap(pos, left);
            heapify(left);
        }
    }

    /**
     * Inserts an element into the heap.
     * @param element the element to insert
     */
    public void insert(int element) {
        if (size >= maxSize) {
            resizeHeap();
        }
        heap[++size] = element;
        int current = size;

        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private void resizeHeap() {
        int[] newHeap = new int[2 * maxSize + 1];
        System.arraycopy(heap, 0, newHeap, 0, maxSize + 1);
        heap = newHeap;
        maxSize *= 2;
    }

    /**
     * Removes and returns the minimum element from the heap.
     * @return the minimum element
     */
    public int remove() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int popped = heap[1];
        heap[1] = heap[size--];
        heapify(1);
        return popped;
    }
}

