package nadocoding.quiz07;

class ShrimpBurger extends Hamburger{
    public String name;

    public ShrimpBurger() {
        super("새우버거");
    }
    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}



