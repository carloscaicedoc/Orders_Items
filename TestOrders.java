import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 5.50;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 6.25;

        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 3.25;

        Item item4 = new Item();
        item4.name = "Capuccino";
        item4.price = 4.35;

        // Order Variables
        Order order1 = new Order();
        System.out.println(order1.total);
        order1.name = "Arthur";

        Order order2 = new Order();
        order2.name = "Daniel";

        Order order3 = new Order();
        order3.name = "Thomas";

        Order order4 = new Order();
        order4.name = "Elizabeth";


        // Applications Simulations
        order2.items.add(item1);
        order2.total += item1.price;

        // Order3 ordered a cappuchino. Add the cappuchino to their order list and to their tab. 
        order3.items.add(item4);
        order3.total += item4.price;

        // Order4 requested a latte. 
        order4.items.add(item2);
        order4.total += item2.price;

        // Arthur ordered regular coffee. The drink is ready. 
        order1.items.add(item3);
        order1.total += item3.price;
        order1.ready = true;

        // Elizabeth ordered 2 lattes. 
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        // Daniel's order is ready. 
        order2.ready = true;


        // Test code:
        // Arthur's order
        System.out.println("**************");
        // System.out.println("Name: %s\n", order1.name);
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Drink Ready Status: %s\n", order1.ready);
        System.out.println("**************");
        // Daniel's order
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Drink Ready Status: %s\n", order2.ready);
        System.out.println("**************");
        // Thomas's order
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Drink Ready Status: %s\n", order3.ready);
        System.out.println("**************");
        // Elizabeth's order
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Drink Ready Status: %s\n", order4.ready);
        System.out.println("**************");
    }
}
