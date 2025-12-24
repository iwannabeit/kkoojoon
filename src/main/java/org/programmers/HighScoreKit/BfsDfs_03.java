package org.programmers.HighScoreKit;

import java.util.LinkedList;
import java.util.Queue;

public class BfsDfs_03 {
    public static void main(String[] args){
        
    }

    static int solution(int[][] maps){
        int answer = 0;
        boolean[][] visited = new boolean[maps.length][maps.length];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        bfs(dx, dy, visited);
        

        return answer;
    }

    static void bfs(int[] dx, int[] dy, boolean[][] visited){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = true;
        
    }
}
