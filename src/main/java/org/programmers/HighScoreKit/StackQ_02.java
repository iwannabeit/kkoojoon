package org.programmers.HighScoreKit;

public class StackQ_02 {
    public static void main(String[] args){
        funcDevelop(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }

    public static int[] funcDevelop(int[] progress, int[] time){
        int idx = 0; 
        int releaseIdx = 0;
        int[] released = new int[progress.length];
    
        while(idx <= progress.length){
            // 1. 하루 진행
            for(int i=0; i<progress.length; i++){
                progress[i] += time[i];
                if(progress[i] >= 100){
                    progress[i] = 100;
                }
            }
            // 2. 배포 로직
            if(progress[idx] == 100){
                // 다음 진행 index가 100이면 같은 배포 묶음. released 인덱스 증가x
                if(progress[idx+1] == 100){
                    released[releaseIdx] += 1;
                    idx++;
                // 다음 진행 index가 100이 아니면 다른 배포 묶음. released 인덱스 증가
                }else{
                    released[releaseIdx] += 1;
                    idx++;
                    releaseIdx++;
                }
            }
        }
        return released;
    }
}
