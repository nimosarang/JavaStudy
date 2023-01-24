package kosta.api;

public class PersonMain {

    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("홍길동", 20);




        if(p1.equals(p2)){
            System.out.println("같다"); //Person 에서 equals 메소드 오버라이딩해서 수정하기 전 => 출력값 : 다르다
        }else {
            System.out.println("다르다"); //Person 에서 equals 메소드 오버라이딩해서 수정 후 => 출력값 : 같다
        }

        System.out.println(p1); //kosta.api.Person@7d417077
        System.out.println(p1); //Person{name='홍길동', age=20}

        //toString 메소드가 없어서 toString 메소드 오버라이딩 수정 전에는 주소값 출력 (toString 은 주소값 리턴) //

    }
}
