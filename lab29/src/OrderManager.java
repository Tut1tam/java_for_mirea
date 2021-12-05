import java.util.HashMap;
import java.util.Map;

public class OrderManager {

    private Map<String, Order> orderMap = new HashMap<>();

    public void addOrder(String address, Order order) {
        if (orderMap.containsKey(address)) {
            throw new OrderAlreadyAddedException();
        }
        orderMap.put(address, order);
    }

    public Order getOrder(String address) {
        return orderMap.get(address);
    }

    public void deleteOrder(String address) {
        orderMap.remove(address);
    }

    public void addToOrder(String address, Item item) {
        orderMap.get(address).add(item);
    }

    public Order[] getOrdersArray() {
        return orderMap.values().toArray(new Order[0]);
    }

    public int getTotal() {
        int total = 0;
        for (Order order : orderMap.values()) {
            total += order.costTotal();
        }
        return total;
    }

    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (Order order : orderMap.values()) {
            quantity += order.itemQuantity(itemName);
        }
        return quantity;
    }

}