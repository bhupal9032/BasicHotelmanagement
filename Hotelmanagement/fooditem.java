public class fooditem {
    private String itemname;
    private static int price;
    private static int quantity;

    public fooditem(String itemname, int price, int quantity) {
        this.itemname = itemname;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public static int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
