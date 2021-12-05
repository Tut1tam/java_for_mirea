import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class InternetOrder implements Order, Serializable {

    private static class Node implements Serializable {
        Node prev, next;
        MenuItem item;

        public Node(Node prev, Node next, MenuItem item) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }

    private Customer customer;
    private Node head = null, tail = null;
    private int size = 0;

    @Override
    public boolean add(MenuItem item) {
        if (head == null) {
            head = tail = new Node(null, null, item);
        } else {
            tail.next = new Node (tail, null, item);
            tail = tail.next;
        }
        size += 1;
        return true;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        Node current = head;
        int quantity = 0;
        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                quantity += 1;
            }
            current = current.next;
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        return itemQuantity(item.getName());
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] order = new MenuItem[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            order[i] = current.item;
            current = current.next;
        }
        return order;
    }

    @Override
    public boolean remove(String itemName) {
        Node current = head;
        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                if (current.prev == null) {
                    head = current.next;
                } else {
                    current.prev = current.next;
                }
                size -= 1;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                if (current.prev == null) {
                    head = current.next;
                } else {
                    current.prev = current.next;
                }
                count += 1;
            }
            current = current.next;
        }
        size -= count;
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public int costTotal() {
        Node current = head;
        int total = 0;
        while (current != null) {
            total += current.item.getCost();
            current = current.next;
        }
        return total;
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
    public String[] itemsNames() {
        return Arrays.stream(getItems())
                .map(MenuItem::getName).distinct().toArray(String[]::new);
    }

    @Override
    public MenuItem[] sortedItemByCostDesc() {
        return Arrays.stream(getItems())
                .sorted(Comparator.comparingInt(MenuItem::getCost))
                .toArray(MenuItem[]::new);
    }
}