package org.programmers.HighScoreKit;

import java.util.*;

public class BfsDfs_04 {
  // static int[] visited;
  
  public static void main(String[] args){
    solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"});
  }

  static int solution(String begin, String target, String[] words) {
        Queue<String> q = new LinkedList();
        boolean[] visited = new boolean[words.length];

        int diffCnt = 0;      
        int answer = 0;
        String nxtWord = "";
        
        q.offer(begin);
        
        while(!q.isEmpty()){
          nxtWord = q.poll();
          if(nxtWord.equals(target)){
            break;
          }
          for(int i=0; i<words.length; i++){
            if(visited[i]){ continue;}
            for(int j=0; j<begin.length(); j++){
              if(words[i].charAt(j) == nxtWord.charAt(j)){
                diffCnt++;
              }
            }

            if(diffCnt == 2){
              q.offer(words[i]);
              visited[i] = true;
              answer++;
            }
            diffCnt=0;
          }
        }
        return answer;
    }
}
