public class SnackMachineSlot {
    private String itemName;
    private double price;
    private int quantity;
    private int itemsSold;

    public SnackMachineSlot(String giveItemName, double initialPrice, int initialQuantity) {
        itemName = giveItemName;
        itemsSold = 0;
        if (initialPrice < 0) {
            initialPrice = 0.0;

        } else {
            price = initialPrice;
        }
        if (initialQuantity < 0) {
            initialQuantity = 0;
        } else {
            quantity = initialQuantity;
        }

    }

    public void purchaseOne() {
        if (quantity > 0) {
            quantity--;
            itemsSold++;
        } else if (quantity == 0) {

        }

    }

    public double getRevenue() {
        return itemsSold * price;
    }

    public String toString() {
        return "Item: " + itemName + ", Price: " + price + ", In Stock: " + quantity + ", Items Sold: " + itemsSold;

    }
}
