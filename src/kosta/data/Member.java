package kosta.data;

public class Member implements Comparable<Member> { //멤머객체 끼리 정렬하겠다, <최초의 정렬 기준>을 Comparable 로 세우겠다!
    private String name;
    private int age;
    private String address;

    public Member() {
    }

    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "바보들{" +
                "이름: '" + name + '\'' +
                ", 나이: " + age +
                ", 주소: '" + address + '\'' +
                '}';
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Member o) { //최초의 정렬기준 세우자  //Member o가 뒤에꺼
        //나이를 기준으로 오름 차순하겠다
        if (age < o.age) {
            return -1; //자리 안바꾸겟다
        } else if (age > o.age) {
            return +1; // 앞높 나이가 크면 자리 바꾼다
        }
        return 0;
    }

}
