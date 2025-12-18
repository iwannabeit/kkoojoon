package org.programmers.HighScoreKit;

import java.util.LinkedList;
import java.util.Queue;

public class BfsDfs_02 {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[][]{{1,0,0},{0,1,1},{0,1,1}}));
    }

    static int solution(int n, int[][] computers){
        int answer = n;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[computers.length];

        for(int start = 0; start<computers.length;start++){
            if(visited[start]) continue;
            
            q.offer(start);
            
            while(!q.isEmpty()){
                int nodeIdx = q.poll();
                visited[nodeIdx] = true;
                
                for(int i=0; i<computers[nodeIdx].length; i++){
                    if(computers[nodeIdx][i] == 1 && !visited[i]){
                        visited[i] = true;
                        answer -= 1;
                        q.offer(i);
                    }
                }
                
            }
                
        }

        return answer;
    }

    
}
