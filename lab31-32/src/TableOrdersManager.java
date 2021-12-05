import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TableOrdersManager implements OrdersManager, Serializable {

    Map<Integer, Order> orderMap = new HashMap<>();

    public void add(Order order, int tableNumber) {
        orderMap.put(tableNumber, order);
    }

    public void addItem(MenuItem item, int tableNumber) {
        orderMap.get(tableNumber).add(item);
    }

    public Order getOrder(int tableNumber) {
        return orderMap.get(tableNumber);
    }

    public void remove(int tableNumber) {
        orderMap.remove(tableNumber);
    }

    @Override
    public int itemsQuantity(String itemName) {
        return orderMap.values()
                .stream()
                .map(order -> order.itemQuantity(itemName))
                .reduce(0, Integer::sum);
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public Order[] getOrders() {
        return orderMap.values().toArray(new Order[0]);
    }

    @Override
    public int ordersCostSummary() {
        return orderMap.values()
                .stream()
                .map(Order::costTotal)
                .reduce(0, Integer::sum);
    }

    @Override
    public int ordersQuantity() {
        return orderMap.values()
                .stream()
                .map(Order::itemsQuantity)
                .reduce(0, Integer::sum);
    }


}