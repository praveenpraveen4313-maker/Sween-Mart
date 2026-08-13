public class Cart {

    public static void viewCart(User user) {

        if (user.cart.isEmpty()) {
            System.out.println("Cart is Empty");
        } else {
            System.out.println("\nYour Cart");

            for (String item : user.cart) {
                System.out.println(item);
            }
        }
    }

    public static void addToCart(User user, int productNumber) {

        if (productNumber >= 1 &&
            productNumber <= Product.products.length) {

            user.cart.add(Product.products[productNumber - 1]);

            System.out.println(
                Product.products[productNumber - 1] +
                " Added to Cart."
            );

        } else {
            System.out.println("Invalid Product");
        }
    }

    public static void checkout(User user) {

        if (user.cart.isEmpty()) {
            System.out.println("Cart is Empty");
            return;
        }

        int total = 0;

        System.out.println("\nCheckout");

        for (String item : user.cart) {

            for (int i = 0; i < Product.products.length; i++) {

                if (item.equals(Product.products[i])) {

                    System.out.println(
                        item + " - Rs." + Product.prices[i]
                    );

                    total += Product.prices[i];
                }
            }
        }

        System.out.println("Total Amount = Rs." + total);
        System.out.println("Order Placed Successfully!");

        user.cart.clear();
    }
}