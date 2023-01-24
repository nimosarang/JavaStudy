package Mission;

import java.util.Set;
import java.util.TreeSet;

public class asaaa {
    public static void main(String[] args) {

        Set<Integer> lotto = new TreeSet<Integer>();

        while (true){
            int random = (int) (Math.random()*45)+1;
            lotto.add(random);
            if(lotto.size() == 6){
                break;
            }
        }

        System.out.println(lotto);

    }
}
