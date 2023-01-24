package Mission;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class bbbbb {
    public static void main(String[] args) {

        List<Integer> lotto = new LinkedList<>();

        for (int i = 0; i < 6; i++) {
            lotto.add((int) (Math.random()*45)+1);
            for (int j = 0; j < i; j++) {
                if(lotto.get(i)==lotto.get(j)){
                    i--;
//                    lotto.remove(i);
                }
            }
        }

        for (int i = 0; i < lotto.size(); i++) {
            System.out.print(lotto.get(i)+", ");
        }

//        Iterator<Integer> iter = lotto.iterator();
//        while (iter.hasNext()){
//            System.out.println();
//            System.out.print(iter.next());
//        }



    }
}
