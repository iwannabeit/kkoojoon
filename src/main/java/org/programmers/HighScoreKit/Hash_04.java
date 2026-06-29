package org.programmers.HighScoreKit;

import java.util.*;

public class Hash_04 {

  static List<String> selected = new ArrayList<>();
  static Map<String, ArrayList<String>> map = new HashMap<>();
  static List<String> keys;
  static int answer = 0;
  
    public static void main(String[] args) {
    solution(new String[][]{{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}});

  }

  static int solution(String[][] clothes){

      for(String[] clothe: clothes){
          map.putIfAbsent(clothe[1], new ArrayList<>());
          map.get(clothe[1]).add(clothe[0]);
      }
      System.out.println(map);
      keys = new ArrayList<>(map.keySet());

      for (int r = 1; r <= map.size(); r++) {
            combination(0, r);
        }


    return answer;
  }
  
  static void combination(int start, int r) {
        if (selected.size() == r) {
            System.out.println(selected);
            int cnt = 1;

            for(String selectKey : selected){
              cnt *= map.get(selectKey).size();
            }
            answer += cnt;
            return;
        }

        for (int i=start; i < map.size(); i++) {
            selected.add(keys.get(i));
            combination(i + 1, r);
            selected.remove(selected.size() - 1);
        }
    }
  
}
