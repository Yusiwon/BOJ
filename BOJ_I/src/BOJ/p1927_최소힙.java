package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1927_√÷º“»¸ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        MinHeap minheap = new MinHeap(100001);

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) {
                System.out.println(minheap.delete());
            }
            else {
                minheap.insert(num);
            }
        }
    }
}

class MinHeap {
    int heap[];
    int size;

    public MinHeap(int size) {

        heap = new int[size];
    }

    public void insert(int n) {
        heap[++size] = n;
        for(int i = size; i > 1; i /=2) {
            if(heap[i/2] > heap[i]) {
                swap(i/2, i);
            }
            else {
                break;
            }
        }
    }

    public int delete() {
        if(size == 0)
            return 0;

        int root = heap[1];
        heap[1] = heap[size];
        size--;

        for(int i = 1; i*2 <= size;) {
            if(heap[i] < heap[i*2] && heap[i] < heap[i*2 +1]) {
                break;
            }
            else if(heap[i*2] < heap[i*2 +1]) {
                swap(i, i*2);
                i = i*2;
            }
            else {
                swap(i, i*2+1);
                i = i*2+1;
            }
        }
        return root;
    }

    public void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
}
