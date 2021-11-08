package burgers;

public class HealthyBurger extends Hamburger {
    private boolean meat;

    public HealthyBurger() {
        super("Brown rye bread".toLowerCase(), "Healthy Burger", 4.50);
        this.meat = true;

    }
    public static boolean itshealthy() {
        return true;
    }

}


