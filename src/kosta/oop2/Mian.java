package kosta.oop2;

public class Mian {
    public static void main(String[] args) {

        Study study = new Study();
        Work work = new Work();
        Sleeping sleeping = new Sleeping();

//        Role role = new Role() { //위에 3개처처럼 클래스파일 또 새로 만들기 귀찮아, 익명클래스로 만들어볼 수 있다, (Role은 인터페이스 이름이다 not 클래스이름)
//            @Override
//            public void doing() {
//                System.out.println("Driver role");
//            }
//        };

        Person person = new Person("안성민", new Role() {
            @Override
            public void doing() {
                System.out.println("Driver role");
            }
        });

        person.doIt();

    }
}
