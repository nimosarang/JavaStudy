package kosta.oop2;

public class Person {
    private String name;
    private Role role; //이 사람의 이름은 name 이고 공부를 하는구나

    public Person(){}

    public Person(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public void doIt(){
        System.out.print("나 " + name);
        role.doing();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
