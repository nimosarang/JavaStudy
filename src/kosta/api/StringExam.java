package kosta.api;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringExam {
    public static void main(String[] args) {
//        //1.String 클래스 생성하는 방법
        String string = "ABC";
        String string2 = "ABC";
//        // string 과 string2는 같다가 뜨고
        String string3 = new String("ABC");
//        //string & 2 와 string3은 다르다가 뜬다
//
//        if(string == string2){ //  == 는 주소값을 가지고 비교함
//            System.out.println("같다");
//        }else{
//            System.out.println("다르다");
//        }

        //2.String 객체 특징(불변성) -> StringBuffer, StringBuilder 클래스는 가변성!
        String string4 = string.concat("EDF"); // 자기자신 변경불가
//        System.out.println(string4); //ABC 출력됨

        //동적쿼리문 (+)연산자 => 변경가능
        String sql = "select * from board";
        int num = 10;

        if (num == 10) {
            sql += "where num = 10";
        }

//        System.out.println(sql);
//    }
//        StringBuffer sb = new StringBuffer("elect*from board");
//        int num = 10;
//
//        if (num == 10) {
//            sb.append("where num = 10");
//        }
//        System.out.println(sb.toString());
//    }
        //해당 문자열의 위치를 파악 => indexOf("문자열") => 해당문자열 인덱스, 없으면 -1
        System.out.println(sql.indexOf("*")); // *은 몇번째에 있나효? // 7번쨰 _select * from board

        //문자열 길이
        System.out.println(sql.length()); // 33

        //charAt(인덱스) : char -> 인덱스에 해당하는 문자 1개 리턴
//        for (int i = 0; i < sql.length(); i++) {
//            System.out.print(sql.charAt(i)); //for문 다 돌아서 전체 문자 찍어 select * from boardwhere num = 10 출력
//        }

        //문자열 부분 추출 : subString(5), subString(5, 10) => 주의) 0부터 시작임, 6번째부터 11번째 전까지
        String sql2 = "ABC DEF";
        System.out.println(sql2.substring(2, 5));

        //퀴즈) sql 변수에서 "board" 문자열만 추출해서 출력해보자! indexOf() 사용하면 위치 추적 편함
        System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board") + 5));

        //퀴즈2 )
        String fileName = "Kosta.jpg";

        String head = "";
        head = fileName.substring(0, fileName.indexOf("."));

        String pattern = "";
        pattern = fileName.substring((fileName.indexOf(".")+1));

        System.out.println(head + " : " + pattern);  //kosta : jpg

        if(fileName.endsWith("jpg")){ //startsWith("문자열")
            System.out.println("이미지 파일");
        }


        String id = "kosta";
        String m_id = "Kosta ";

        //소대문자 구분안함 (공백은 구분함)
        if(id.equalsIgnoreCase(m_id.trim())){
            System.out.println("같다");
        }else {
            System.out.println("다르다");
        }

        //문자열 => String 배열 젼환
        String fruit = "사과/포도/수박/배";
        String arr[] = fruit.split("/");
        System.out.println(Arrays.toString(arr));

        //정수를 문자열로 변환하는 2가지 변형법
        int n = 10;
        String s = n + ""; //크기가 더 큰 문자열로 형변환 노리기
        String s2 = String.valueOf(n);

    }
}

