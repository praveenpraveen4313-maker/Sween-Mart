import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Shopping Mall =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    ShoppingMallAuth.register(sc);
                    break;

                case 2:

                    User user = ShoppingMallAuth.login(sc);

                    if (user != null) {

                        while (true) {

                            System.out.println(
                                "\n===== Shopping Menu ====="
                            );

                            System.out.println("1. Browse Products");
                            System.out.println("2. Add to Cart");
                            System.out.println("3. View Cart");
                            System.out.println("4. Checkout");
                            System.out.println("5. Logout");

                            System.out.print("Enter Choice: ");

                            int ch = sc.nextInt();
                            sc.nextLine();

                            switch (ch) {

                                case 1:
                                    Product.displayProducts();
                                    break;

                                case 2:
                                    Product.displayProducts();

                                    System.out.print(
                                        "Enter Product Number: "
                                    );

                                    int p = sc.nextInt();
                                    sc.nextLine();

                                    Cart.addToCart(user, p);
                                    break;

                                case 3:
                                    Cart.viewCart(user);
                                    break;

                                case 4:
                                    Cart.checkout(user);
                                    break;

                                case 5:
                                    System.out.println("Logged Out");
                                    break;

                                default:
                                    System.out.println(
                                        "Invalid Choice"
                                    );
                            }

                            if (ch == 5) {
                                break;
                            }
                        }
                    }

                    break;

                case 3:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}