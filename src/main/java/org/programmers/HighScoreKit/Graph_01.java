package org.programmers.HighScoreKit;

import java.util.*;

public class Graph_01 {
  public static void main(String[] args){
    
  }

  static int solution(int n, int[][] edges){
    int[] dist = new int[n+1];
    boolean[] visit = new boolean[n+1];
    ArrayList<Integer>[] list = new ArrayList[n+1];

    for(int i=0; i<=n; i++){
      list[i] = new ArrayList<>();
    }

    for(int[] edge: edges){
      list[edge[0]].add(edge[1]);
      list[edge[1]].add(edge[0]);
    }

    bfs(list, dist, visit, n);
    return 1;
  }

  public static void bfs(ArrayList<Integer>[] list, int[] dist, boolean[] visit, int n){
    Queue<int[]> q = new LinkedList<>();
    
    q.offer(new int[]{1, 0});
    visit[1] = true;

    while(!q.isEmpty()){
      int[] poll = q.poll();

      if(poll[0] == n){
        return;
      }

      while(!visit[poll[0]]){}
    }

  }
  
}
