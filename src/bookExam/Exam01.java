package bookExam;

class Card{
    String kind; //인스턴스변수
    int num; //인스턴스변수
    static int width = 100; //클래스변수(static)
    static int height = 250; //클래스변수(static)

    public static void height(int i) {
    }
}
public class Exam01 {
    public static void main(String[] args) {
        System.out.println("모든 카드가 가진 크기 (공통 정보) with 클래스(static)변수");
        System.out.println("카드의 폭: " + Card.width);
        System.out.println("카드의 높이: " + Card.height);
        System.out.println();
        //클래스 변수는 객채 생성 없이 '클래스명.클래스변수'로 직접 사용 가능

        Card card1 = new Card(); 
        System.out.println("card1의 정보");
        System.out.println("카드의 폭: "+ Card.width);
        System.out.println("카드의 높이: "+ Card.height);
        card1.kind = "하트";
        card1.num = 7;
        System.out.println("카드종류 : " + card1.kind); //인스턴스 변수
        System.out.println("카드숫자 : " + card1.num); //인스턴스 변수
        System.out.println();

        Card card2 = new Card();
        System.out.println("card2의 정보");
        System.out.println("카드의 폭: "+ Card.width);
        System.out.println("카드의 높이: "+ Card.height);
        card2.kind = "스페이드";
        card2.num = 4;
        System.out.println("카드종류 : " + card2.kind); //인스턴스 변수
        System.out.println("카드숫자 : " + card2.num); //인스턴스 변수
        System.out.println();
    }




}
