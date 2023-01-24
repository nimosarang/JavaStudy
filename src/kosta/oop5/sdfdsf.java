package kosta.oop5;

public class sdfdsf {
}

//interface Speakable  - String speak()//추상메소드 -- 1
//
//class Man - String name - 생성자(String name) - getName() -- 2 (name 리턴)
//
//class Reader extends Man implements Speakable -- 3
// - speak(){getName + "자바화이팅"}
//
//class Work extends Man implements Speakable -- 4
// - speak(){getName + "열심히 일해야 한다."}
//
//class Student extends Man -- 5
// - speak(){getName + "공부나 열심히해"} ]
// /Student클래스의 speak는 오버라이딩과 아무 관계가 없는 메소드
//
//main() -- 6
//Object obj[] = {new Reader("둘리"), new Work("길동"),
//                           new Student("마이콜")};
//{}
//            speak() -> 호출결과 -> Reader, Work
//         * instanceOf 연산자로 해당 데이터형인지 판별할수 있음
//            ex)  "abc" instanceOf String  ==> true
//              ob
////object 최상위이므로 형변환 가능
//
//for문을 돌렸을때 Student를 제외한 Reader와 Work 만 출력해라.