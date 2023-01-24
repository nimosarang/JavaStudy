package Mission;

import java.util.Arrays;

public class LottoGame {
    public static void main(String[] args) {

        int[] randomNum = new int[6];

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = (int) (Math.random()*45)+1;
            for (int j = 0; j < i; j++) {
                if(randomNum[i]==randomNum[j]){
                    i--;
                }
            }
        }
        System.out.println("\t 로또 번호 생성기\t");
        Arrays.sort(randomNum); //배열 오름차순 정리
        System.out.println(Arrays.toString(randomNum));




    }

}

