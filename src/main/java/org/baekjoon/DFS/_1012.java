package org.baekjoon.DFS;

import java.io.*;
import java.util.*;

public class _1012 {
    static boolean[][] visited;
    static int[][] map; 
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer line1 = new StringTokenizer(bf.readLine());
        
        int T = Integer.parseInt(line1.nextToken());

        for(int i=0; i<T; i++){
            StringTokenizer mnk = new StringTokenizer(bf.readLine());
            int M = Integer.parseInt(mnk.nextToken());
            int N = Integer.parseInt(mnk.nextToken());
            int K = Integer.parseInt(mnk.nextToken());

            map = new int[N][M];

            for(int j=0; j<K; j++){
                StringTokenizer cabXY = new StringTokenizer(bf.readLine());
                int cabX = Integer.parseInt(cabXY.nextToken());
                int cabY = Integer.parseInt(cabXY.nextToken());
                map[cabX][cabY] = 1;
            }

            
        }
        
    }

    static void dfs(){
        
    }
}
