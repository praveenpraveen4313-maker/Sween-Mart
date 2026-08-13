public class Product {

    static String[] products = {
        "Shoes",
        "T-Shirt",
        "Watch",
        "Bag",
        "Headphones"
    };

    static int[] prices = {
        1500,
        800,
        2500,
        1200,
        3000
    };

    public static void displayProducts() {
        System.out.println("\nAvailable Products");

        for (int i = 0; i < products.length; i++) {
            System.out.println(
                (i + 1) + ". " + products[i] +
                " - Rs." + prices[i]
            );
        }
    }
}