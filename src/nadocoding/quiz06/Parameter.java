package nadocoding.quiz06;

public class Parameter {
    // 전달값(Parameter, 매개변수)이 있는 메소드
    public static void power(int number) { // Parameter, 매개변수
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {

//        power(2); // 2 * 2 =4 // Argument, 인자

        powerByExp(2, 3);

    }

}
