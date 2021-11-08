package burgers;

import java.util.Scanner;

public class Hamburger {

    private String breadType;
    private boolean meat;
    private String name;
    private double price;

    // Creating regular hamburger defining bread type, meat, name and price
    public Hamburger(String breadType, String name, double price) {
        this.breadType = breadType;
        this.meat = true;
        this.name = name;
        this.price = price; // regular burger price is 3.50$
    }

    public String getBreadType() {
        return breadType.toLowerCase();
    }

    public String getName() {
        return name.toLowerCase();
    }

    // get price of the regular burger if needed.
    public double getPrice() {
        return price;
    }

    //Additions and price code
    public void additionsAndPrice() {

        System.out.println("Current total is = " + this.price + "$.");
        int lettuce = 0;
        int tomato = 0;
        int cheese = 0;
        int pickles = 0;
        int bacon = 0;
        int onions = 0;

        while (true) {
            System.out.println();
            System.out.println("Would you like to add some extras to your burger?");

            // user inputs which additions they would like (in case healthy burger is chosen)
            if (this.breadType.equals("brown rye bread")) {
                System.out.println("type: [1] for Lettuce 0.50$ per add, " + "[2] for tomato 0.75$ per add, " + "\n" +
                        "[3] for cheese 1.25$ per add, " + "[4] for pickles 0.75 per add, " + "\n" + "[5] for bacon 1.50 per add, " +
                        "[6] for onions 0.50 per add," + "\n" + " any other number to skip.");
                // in case regular burger is chosen
            } else {
                System.out.println("type: [1] for Lettuce 0.50$ per add, " + "[2] for tomato 0.75$ per add, " + "\n" +
                        "[3] for cheese 1.25$ per add, " + "[4] for pickles 0.75 per add, " + "\n" + "any other number to skip.");
            }

            // test if input from user is of type int
            Scanner scanner = new Scanner(System.in);
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                // depending on input add count to proper additions and total price
                switch (scanner.nextInt()) {

                    case 1: // lettuce
                        scanner.nextLine();
                        this.price += 0.50; // increase total by 0.50$
                        lettuce++;
                        System.out.println("Lettuce added to order, added cost of 0,50$. Total = " + this.price + "$");
                        continue;

                    case 2: // tomato
                        scanner.nextLine();
                        this.price += 0.75; // increase total by 0.75$
                        tomato++;
                        System.out.println("Tomato added to order, added cost of 0,75$. Total = " + this.price + "$");
                        continue;

                    case 3: // cheese
                        scanner.nextLine();
                        this.price += 1.25; // increase total by 1.25$
                        cheese++;
                        System.out.println("Cheese added to order, added cost of 1,25$. Total = " + this.price + "$");
                        continue;

                    case 4: // pickle
                        scanner.nextLine();
                        this.price += 0.75; // increase total by 0.75$
                        pickles++;
                        System.out.println("Pickle added to order, added cost of 0,75$. Total = " + this.price + "$");
                        continue;

                    case 5: // bacon
                        if (this.breadType.equals("brown rye bread")) {
                            scanner.nextLine();
                            this.price += 1.50; // increase total by 1.50$
                            bacon++;
                            System.out.println("Bacon added to order, added cost of 1,50$. Total = " + this.price + "$");
                            continue;
                        }

                    case 6: // onions
                        if (this.breadType.equals("brown rye bread")) {
                            scanner.nextLine();
                            this.price += 0.50; // increase total by 0.50$
                            onions++;
                            System.out.println("Onions added to order, added cost of 0,50$. Total = " + this.price + "$");
                            continue;
                        }

                    default: // if that's it for addons then print out nice message and close scanner.
                        if (this.breadType.equals("brown rye bread")) {
                            System.out.println("Thank you for placing your order for (" + getClass().getSimpleName() + " with " + lettuce + "x lettuce, "
                                    + tomato + "x tomatoes, " + cheese + "x cheese, " + pickles + "x pickles, " + bacon + "x bacon, " + onions + "x onions). "
                                    + " Your total is = " + this.price + "$");
                        } else {
                            System.out.println("Thank you for placing your order for (" + getClass().getSimpleName() + " with " + lettuce + "x lettuce, "
                                    + tomato + "x tomatoes, " + cheese + "x cheese, " + pickles + "x pickles). " + " Your total is = " + this.price + "$");
                        }
                        scanner.close();
                }// break out of while loop.
                break;

                // if user input is not of type int then restart loop while remembering correct inputs.
            } else {
                System.out.println("Invalid input, please type in the correct digit.");
                System.out.println();
                scanner.nextLine();
            }
        }
    }
}
