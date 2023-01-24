package kosta.oop2;

public class Study implements Role {
    @Override  //추상클래스와 인터페이스는 오버라이딩 강요됨
    public void doing() {
        System.out.println("Study 역할");

    }
}
