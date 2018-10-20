package Assignment5;

public class TestCheckOut {

    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
        checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
        checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
        checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));

        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
        System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);

        checkout.clear();

        checkout.enterItem(new IceCream("Strawberry Ice Cream", 145));
        checkout.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel", 50));
        checkout.enterItem(new Candy("Gummy Worms", 1.33, 89));
        checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
        checkout.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
        checkout.enterItem(new Candy("Candy Corn", 3.0, 109));

        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
        System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);

        System.out.println("------------------------------------------------");
        System.out.println("Unit test for candy:");
        Candy c = new Candy("Candy name",2.5,100);
        System.out.println("should be Candy name, actually is " + c.getName());
        System.out.println("should be 2.5, actually is "+c.weight);
        System.out.println("should be 100, actually is "+c.pricePerPound);
        System.out.println("should be 250, actually is "+c.getCost());


        System.out.println("------------------------------------------------");
        System.out.println("Unit test for cookie:");
        Cookie k = new Cookie("Cookie name",3,100);
        System.out.println("should be Cookie name, actually is "+k.getName());
        System.out.println("should be 3, actually is "+k.number);
        System.out.println("should be 100, actually is "+k.pricePerDozen);
        System.out.println("should be 25, actually is "+k.getCost());


        System.out.println("------------------------------------------------");
        System.out.println("Unit test for Ice cream:");
        IceCream I = new IceCream("Icecream name",100);
        System.out.println("should be Icecream name, actually is "+I.getName());
        System.out.println("should be 100, actually is "+I.costOfIceCream);
        System.out.println("should be 100, actually is "+I.getCost());

        System.out.println("------------------------------------------------");
        System.out.println("Unit test for Sundae:");
        Sundae S = new Sundae("Icecream name",100,"Topping name", 50);
        System.out.println("should be Icecream name, actually is "+S.getName());
        System.out.println("should be Topping name, actually is "+S.toppingName);
        System.out.println("should be 100, actually is "+S.costOfIceCream);
        System.out.println("should be 50, actually is "+S.costOfTopping);
        System.out.println("should be 150, actually is "+S.getCost());

        System.out.println("-------------------------------------------------");
        System.out.println("Unit test for DessertShoppe:");
        String D = DessertShoppe.cents2dollarsAndCents(105);
        System.out.println("should be 1.05, actually is " + D);

        System.out.println("-------------------------------------------------");
        System.out.println("Unit test for Checkout:");
        Checkout C = new Checkout();

        System.out.println("should be 0, actually is "+ C.numberOfItems());
        C.enterItem(c);
        System.out.println("should be 1, actually is "+ C.numberOfItems());
        System.out.println("should be 250, actually is "+ C.totalCost());
        System.out.println("should be 16 actually is "+ C.totalTax());
        C.clear();
        System.out.println("should be 0, actually is "+ C.numberOfItems() );
    }
}