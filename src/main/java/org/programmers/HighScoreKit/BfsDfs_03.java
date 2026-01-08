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
        bfs(dx, dy, visited, maps);
        

        return answer;
    }

    static void bfs(int[] dx, int[] dy, boolean[][] visited, int[][] maps){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];

                // 범위 체크
                if(nx < 0 || ny < 0 || nx >= maps.length || ny >= maps.length)
                    continue;
                //방문 check , map 조건 check 
                if(!visited[nx][ny] && maps[nx][ny] == 0){
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                }

            }
        }
        
    }
}
