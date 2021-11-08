package burgers;

public class DeluxeBurger extends Hamburger {
    private double fries;
    private double drink;

    public DeluxeBurger() {
        super("Sesame wheat bun".toLowerCase(), "Deluxe Burger".toLowerCase(), 6.00);
        this.fries = 3.00;
        this.drink = 2.50;
    }

    public double totalDeluxe() {
        return super.getPrice() + this.fries + this.drink;
    }

    @Override
    public void additionsAndPrice() {
        System.out.println(getClass().getSimpleName() + " with fries worth " + this.fries + "$ and a drink worth "
                + this.drink + "$. Total is " + totalDeluxe() + "$.");
    }
}
