package kosta.api;

public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override //p1.equals(p2)
    public boolean equals(Object obj) { //p1이 equals 호출, 파라미터는 p2
        Person p = (Person) obj;  //p= p2
        if(name.equals(p.getName()) && age == getAge()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //겟셋
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
