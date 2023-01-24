package kosta.lamda;

public class LamdaMain {
    public static void main(String[] args) {

        //MyType -> 익명내부클래스로 구현

        MyType myType = new MyType() {
            @Override
            public void hello() {
                System.out.println("익명클래스 형식 입니다.");
            }
        };
        myType.hello();

        MyType myType1 = () -> {
            System.out.println("람다식 형식 입니다");
        };
        myType1.hello();

        //향상된 람다식 표현
        MyType myType2 = () -> System.out.println("람다식 형식2 입니다");
        myType2.hello();

        //  yourType
        YourType yourType = (String meesage) -> {
            System.out.println("메시지: " + meesage);
        };
        yourType.talk("안녕~?");

        YourType yourType1 = message -> System.out.println("메시지: " + message);
        yourType1.talk("반갑습니다~?");

        //MyNumber 추상메서드 구현(람다식)
        MyNumber myNumber = (x, y) -> (x > y) ? x : y; //x가 크면 x리턴, 그렇지않으면 y 리턴
        System.out.println(myNumber.getMax(10,20));

    }
}
