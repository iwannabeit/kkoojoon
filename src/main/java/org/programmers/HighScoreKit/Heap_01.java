package org.programmers.HighScoreKit;

import java.util.Arrays;

public class Heap_01 {
    public static void main(String[] args){
        Maxheap maxheap = new Maxheap();

//        int[] result = maxheap.insert(8, new int[]{9,7,6,5,4,3,2,2,1,3});
        // int[] result = maxheap.delete(new int[]{9,7,6,5,4,3,2,2,1,3});
        // System.out.println(Arrays.toString(result));
        int[] answer = solution(new int[]{1, 2, 3,9,10,12}, 50);
        // System.out.println(answer);
    }

    public static int[] solution(int[] scoville, int K){
        Minheap minheap = new Minheap();
        //heap으로 만들기 위한 배열 복사
        int[] heap = new int[scoville.length+1];
        heap[0] = 0;
        
        // for(int i=0; i<scoville.length; i++){
        //     heap[i+1] = scoville[i];
        // }

        for(int j=0; j<scoville.length; j++){
            minheap.insert(scoville[j], heap);
        }

        return heap;
    }

}

class Minheap{
    public int[] insert(int value, int[] heap){

        if(heap[1] == 1){
            heap[1] = value;
            return heap;
        }
        int idx = heap.length-1;

        while(idx != 1 && value < heap[idx/2]){
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

        // 마지막 자식을 루트로(최대값 삭제)
        heap[1] = heap[heap.length-1];
        heap[heap.length-1] = 0;


        for(int i=1; 2*i<heap.length; i++){
            if(heap[i] < heap[2*i] && heap[i] < heap[2*i+1]){
                break;
            }
            //왼쪽 자식 노드 보다 크면 바꾸기
            else if(heap[i] > heap[2*i]){
                int tmp = heap[i];
                heap[i] = heap[2*i];
                heap[2*i] = tmp;
            }
            else if( heap[i] > heap[2*i+1]){
                int tmp = heap[i];
                heap[i] = heap[2*i+1];
                heap[2*i+1] = tmp;
            }
        }

        return heap;
    }
}

class Maxheap{

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
        
        // 마지막 자식을 루트로(최대값 삭제)
        heap[1] = heap[heap.length-1];
        heap[heap.length-1] = 0;

        
        for(int i=1; 2*i<heap.length; i++){
            if(heap[i] > heap[2*i] && heap[i] > heap[2*i+1]){
                break;
            }
            //왼쪽 자식 노드 보다 작으면 바꾸기
            else if(heap[i] < heap[2*i]){
                int tmp = heap[i];
                heap[i] = heap[2*i];
                heap[2*i] = tmp;
            }
            else if( heap[i] < heap[2*i+1]){
                int tmp = heap[i];
                heap[i] = heap[2*i+1];
                heap[2*i+1] = tmp;
            }
        }

        return heap;
    }
 }