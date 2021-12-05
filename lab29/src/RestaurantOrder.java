public class RestaurantOrder implements Order {

    private Item[] items;

    public RestaurantOrder(Item[] items) {
        this.items = items;
    }

    @Override
    public int itemsQuantity() {
        return items.length;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for (Item item: items) {
            if (item.getName().equals(itemName)) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public Item[] getItems() {
        return items;
    }

    @Override
    public int costTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public boolean add(Item item) {
        return false;
    }

    @Override
    public String[] itemsNames() {
        return new String[0];
    }

    @Override
    public boolean remove(String itemName) {
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public Item[] sortedItemByCostDesc() {
        return new Item[0];
    }
}