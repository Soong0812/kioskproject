package Lv5;

public class MenuItem {
    private String name;
    private String price;
    private String explain;

    public MenuItem(String name, String price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public String getExplain() {
        return explain;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + explain;
    }
}
