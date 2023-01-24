package nadocoding.coffee;

import nadocoding.coffee.user.User;
import nadocoding.coffee.user.VIPUser;

public class GenericClass {
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6name = c6.name;
        System.out.println("주문 고객 이름 : " + c6name);

        System.out.println("-----------------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("강호동"));
        c7.ready();
        System.out.println("-----------------------------");

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈'"));
        c8.ready();
        System.out.println("-----------------------------");

        orderCoffee("김영철");
        System.out.println("-----------------------------");
        orderCoffee("김희철", "아메리카노");
        System.out.println("-----------------------------");
        orderCoffee("37", "라뗴");


    }

    public static <T> void orderCoffee(T name){
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee){
        System.out.println(coffee + " 준비 완료 : " + name);
    }

}
