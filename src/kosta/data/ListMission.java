package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {
    public static void main(String[] args) {
        //List 자료구조를 활용하여 키보드로 부터 입력받은 문자열을 처리하자.
        //1.데이터 추가(List 안에) 2.데이터 삭제 3.전체 출력

        List<String> stringList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1.데이터 추가 2.데이터 삭제 3.전체 출력");
            System.out.println("원하는 메뉴를 선택해주세요 : ");
            String menu = sc.nextLine();

            switch (menu) {

                case "1":

                    System.out.println("데이터를 추가해주세요: ");
                    String adding = sc.nextLine();
                    stringList.add(adding);

                    System.out.println("추가되었습니다!");
                    break;

                case "2" :

                    System.out.println("삭제할 데이터를 입력: ");
                    String removing = sc.nextLine();
                    stringList.remove(removing);

                    System.out.println("삭제되었습니다!");
                    break;


                case "3" :

                    Iterator<String> iter = stringList.iterator();

                    while (iter.hasNext()){
                        System.out.println(iter.next()+"\t");

                    }
                    break;

                case "4" :
                    System.out.println("종료");
                    return;
            }
        }

    }
}
