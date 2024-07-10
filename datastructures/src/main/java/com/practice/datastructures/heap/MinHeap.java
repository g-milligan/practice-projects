package com.practice.datastructures.heap;

public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    public MinHeap(int maxSize) {
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

        if (heap[pos] > heap[leftChild(pos)] || heap[pos] > heap[rightChild(pos)]) {
            if (heap[leftChild(pos)] < heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                heapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                heapify(rightChild(pos));
            }
        }
    }

    public void insert(int element) {
        heap[++size] = element;
        int current = size;

        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int remove() {
        int popped = heap[1];
        heap[1] = heap[size--];
        heapify(1);
        return popped; // min value
    }
}
