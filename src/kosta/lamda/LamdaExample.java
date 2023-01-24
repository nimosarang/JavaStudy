package kosta.lamda;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action( () -> {
            System.out.println("출근합니다");
            System.out.println("프로그래밍을 합니다");
                }
        );

        Workable workable = () -> System.out.println("공부합니다");



        person.action( () -> System.out.println("퇴근합니다")); //명령문이 한줄일 경우 중괄호 생략 가능


    }
}
