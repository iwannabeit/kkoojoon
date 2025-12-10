package org.programmers.HighScoreKit;

public class BfsDfs_01 {
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static boolean[] visited = new boolean[graph.length];
    public static void main(String[] args){
        DFS(1);
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
    static void BFS(){

    }
}
