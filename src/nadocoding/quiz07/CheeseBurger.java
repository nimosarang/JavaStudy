package nadocoding.quiz07;

class CheeseBurger extends Hamburger{
    public String name;

    public CheeseBurger() {
        super("치즈버거");
    }
    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}



