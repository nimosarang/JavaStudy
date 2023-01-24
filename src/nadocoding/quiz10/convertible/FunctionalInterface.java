package nadocoding.quiz10.convertible;

public class FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        //converter.convert(2);

        convertUSD(converter, 2);
    }

    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }

}
