import burgers.DeluxeBurger;
import burgers.HealthyBurger;

public class Main {
    public static void main(String[] args) {
//        1st order
//        burgers.Hamburger hamburger = new burgers.Hamburger("Wheat bun", "Regular burger",3.50);
//        System.out.println(hamburger.getName());
//        System.out.println(hamburger.getBreadType());
//        hamburger.additionsAndPrice();

//        2nd order
        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println(healthyBurger.getName());
        System.out.println(healthyBurger.getBreadType());
        healthyBurger.additionsAndPrice();

//        3rd order
        System.out.println();
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.getName());
        System.out.println(deluxeBurger.getBreadType());
        deluxeBurger.additionsAndPrice();

    }
}
