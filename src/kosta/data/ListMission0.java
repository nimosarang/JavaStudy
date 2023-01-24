package kosta.data;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<String>();

        while (true) {
            System.out.println("1.추가 2.삭제 3.전체출력 ");
            System.out.println("선택: ");
            String menu = sc.nextLine();
            int idx = -1;

            switch (menu) {
                case "1":
                    System.out.println("추가: ");
                    list.add(sc.nextLine());
                    break;

                case "2":
                    System.out.println("삭제:");
                    idx = list.indexOf(sc.nextLine()); //키보드로 부터 입력 받은 문자열이
                    if (idx != -1) { //배열안에 있다면
                        list.remove(idx); //삭제
                    }

                    break;

                case "3":
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i) + ", ");
                    }
                    break;

                case "4":
                    System.out.println("종료");
                    return;

            }
        }


    }
}
