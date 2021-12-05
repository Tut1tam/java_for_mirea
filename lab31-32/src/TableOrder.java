import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class TableOrder implements Order, Serializable {

    private Customer customer;
    private MenuItem[] items;
    private int size;

    public TableOrder() {
        items = new MenuItem[16];
        size = 0;
    }

    @Override
    public boolean add(MenuItem item) {
        if (size == items.length) {
            items = Arrays.copyOf(items, items.length * 3 / 2);
        }
        items[size++] = item;
        return true;
    }

    @Override
    public String[] itemsNames() {
        return Arrays.stream(getItems())
                .map(MenuItem::getName)
                .distinct()
                .toArray(String[]::new);
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                quantity += 1;
            }
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        return itemQuantity(item.getName());
    }

    @Override
    public MenuItem[] getItems() {
        return Arrays.copyOf(items, size);
    }

    @Override
    public boolean remove(String itemName) {
        return false;
    }

    @Override
    public MenuItem[] sortedItemByCostDesc() {
        return Arrays.stream(getItems())
                .sorted(Comparator.comparingInt(MenuItem::getCost))
                .toArray(MenuItem[]::new);
    }

    @Override
    public int costTotal() {
        int cost = 0;
        for (int i = 0; i < size; i++) {
            cost += items[i].getCost();
        }
        return cost;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }
}