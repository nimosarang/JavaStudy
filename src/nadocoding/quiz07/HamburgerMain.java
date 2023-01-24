package nadocoding.quiz07;

public class HamburgerMain {
    public static void main(String[] args) {
        Hamburger[] hamburgers = new Hamburger[3];
        hamburgers[0] = new Hamburger();
        hamburgers[1] = new CheeseBurger();
        hamburgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다");
        System.out.println("-------------------");
        for(Hamburger hamburger : hamburgers){
            hamburger.cook();
            System.out.println("--------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다");


    }






}
