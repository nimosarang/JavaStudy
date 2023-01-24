package Mission;

import java.util.*;

public class ListMission2 {
    public static void main(String[] args) {
        Random random = new Random();
//
//        int arr[] = new int[6];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(45) + 1;
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    i = i - 1;
//                }
//
//            }
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        List<Integer> list = new ArrayList<>(); //크기는 중요치않음 알아서 늘어남
//
//        while (true) {
//            int n = random.nextInt(45) + 1;
//
//            if (list.contains(n)) {
//                continue;
//            } else {
//                list.add(n);
//            }
//
//            if (list.size() == 6) break;
//        }
//
//        Collections.sort(list);
//        System.out.println(list);


        Set<Integer> set = new TreeSet<Integer>(); //TreeSet 은 기본적으로 오름차순 정렬

        for (int i = 0; set.size()<6; i++) {
            set.add(random.nextInt(45)+1);
        }
        System.out.println(set);

    }
}
