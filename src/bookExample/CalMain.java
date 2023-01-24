package bookExample;

import static java.lang.Double.sum;

public class CalMain {
    public static void main(String[] args) {

        Man man = new Man();
        man.action((x, y) -> {
            double result = x+y;
            return result;
        });

        man.action((x,y) -> (x+y));

        man.action((x, y) -> sum(x, y));

    }

    public static double sum(double x, double y){
        return (x + y);
    }
}
