package org.programmers.HighScoreKit;

import java.util.*;

public class BfsDfs_01 {
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static boolean[] visited = new boolean[graph.length];
    public static void main(String[] args){
        // DFS(1);
        BFS(1);
    }
    static void DFS(int nodeIdx){
        visited[nodeIdx] = true;
        System.out.print(nodeIdx+"->");
        for(int node: graph[nodeIdx]){
            //인접노드가 방문한 적이 없다면 재귀
            if(!visited[node]){
                DFS(node);
            }
        }
    }
    static void BFS(int start){
        Queue<Integer> q = new LinkedList<Integer>();
        //첫번째 삽입
        q.offer(start);
        //방문 체크
        visited[start] = true;
        while(!q.isEmpty()){
            int nodeIdx = q.poll();
            System.out.print(nodeIdx+"->");
            for(int i=0; i<graph[nodeIdx].length; i++){
                int tmp = graph[nodeIdx][i];
                if(!visited[tmp]){
                    visited[tmp] = true;
                    q.offer(tmp);
                }
            }
        }
    }
}
