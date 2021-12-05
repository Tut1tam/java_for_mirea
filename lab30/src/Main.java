public class Main {

    public static void main(String[] args) {
        InternetOrder order = new InternetOrder();
        order.add(
                new Drink(
                        200,
                        "Espresso",
                        "Coffee",
                        0,
                        DrinkTypeEnum.COFFEE
                )
        );
        order.add(
                new Dish(
                        250,
                        "Cheesecake",
                        "Dessert"
                )
        );

        order.setCustomer(Customer.MATURE_UNKNOWN_CUSTOMER);

        InternetOrdersManager ordersManager = new InternetOrdersManager();
        ordersManager.add(order);

        System.out.println(ordersManager.ordersCostSummary());
    }

}