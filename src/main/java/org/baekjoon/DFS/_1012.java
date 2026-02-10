package org.baekjoon.DFS;

import java.io.*;
import java.util.*;

public class _1012 {
    static boolean[][] visited;
    static int[][] map; 
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int cnt = 0;

    public static void main(String[] args) throws IOException{

        InputStream is = _1012.class.getResourceAsStream("/org/input.txt");

        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        StringTokenizer line1 = new StringTokenizer(bf.readLine());
        
        int T = Integer.parseInt(line1.nextToken());

        for(int i=0; i<T; i++){
            StringTokenizer mnk = new StringTokenizer(bf.readLine());
            int M = Integer.parseInt(mnk.nextToken());
            int N = Integer.parseInt(mnk.nextToken());
            int K = Integer.parseInt(mnk.nextToken());

            map = new int[N][M];
            visited = new boolean[N][M];

            for(int j=0; j<K; j++){
                StringTokenizer cabXY = new StringTokenizer(bf.readLine());
                int cabX = Integer.parseInt(cabXY.nextToken());
                int cabY = Integer.parseInt(cabXY.nextToken());
                map[cabY][cabX] = 1;
            }

            System.out.println(Arrays.deepToString(map));
            int x=0, y=0; 
            
            for(int k=0; k<4; k++){
                int nx = x+dx[k];
                int ny = y+dy[k];
                System.out.print(nx+" "+ny+" ");

                if(nx<0 || ny < 0 || nx > map[1].length || ny > map[0].length){continue;}

                if(!visited[nx][ny] && map[nx][ny] == 1){
                    dfs(nx, ny);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        
    }

    static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];

                if(nx<0 || ny < 0 || nx > map[1].length || ny > map[0].length){continue;}

                if(!visited[nx][ny] && map[nx][ny] == 1){
                    System.out.print(nx+" "+ny+" ");
                    dfs(nx, ny);
                }
            }
        
    }
}
