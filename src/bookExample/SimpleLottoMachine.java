package bookExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleLottoMachine {
    public static void main(String[] args) {

        //45개의 공을 만든다
        List<Integer> number = new ArrayList<Integer>();

        for (int i = 0; i <= 45; i++) {
            number.add(i);
        }

        //섞는다
        Collections.shuffle(number);

        //뽑는다
        int[] picked = new int[6];

        for (int i = 0; i < 6; i++) {
            picked[i] = number.get(i);
        }

        //결과 출력
        System.out.printf("자동생성번호: %s", Arrays.toString(picked));




    }

}
