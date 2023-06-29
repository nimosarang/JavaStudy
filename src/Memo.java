package baekjoon.memo;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Memo {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(new int[]{1,2,7,10,11});
//        int solution1 = solution.solution(new int[]{9,-1,0});
        System.out.println(solution1);
    }

    static class Solution {
        public int solution(int[] array) {
            int answer = 0;

            Arrays.sort(array);

            answer = array.length / 2;

            return array[answer];
        }
    }
}

