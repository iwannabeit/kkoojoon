package org.programmers.HighScoreKit;

import java.util.Arrays;

public class Heap_01 {
    public static void main(String[] args){
        Minheap minheap = new Minheap();

        int[] result = minheap.insert(8, new int[]{9,7,6,5,4,3,2,2,1,3});
        System.out.println(Arrays.toString(result));
    }

}

class Minheap{

    public int[] insert(int value, int[] arry){
        //heap 새로 생성
        int[] heap = new int[arry.length+2];
        heap[0] = 0;
        //복사
        for(int i=0; i<arry.length; i++){
            heap[i+1] = arry[i];
        }
        
        int idx = heap.length-1;

        while(idx != 1 && value > heap[idx/2]){
            heap[idx] = heap[idx/2];

            idx = idx/2;
        }
        heap[idx] = value;
        return heap; 
    }

    public int[] delete(int[] arry){
        //heap 새로 생성
        int[] heap = new int[arry.length+1];
        heap[0] = 0;
        //복사
        for(int i=0; i<arry.length; i++){
            heap[i+1] = arry[i];
        }
        
        //루트노드 삭제(최대값 삭제)
        heap[heap.length-1] = 0;
        heap[1] = heap[heap.length-1];

        
        for(int i=1; i<heap.length; i++){
            if(heap[i] < heap[2*i]){
                int tmp = heap[i];
                heap[i] = heap[2*i];
            }
            else if( heap[i] < heap[2*i+1]){

            }
        }

        return heap;
    }
 }