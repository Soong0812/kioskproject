package Lv2;

public class MenuItem {
    private final String name;
    private final String price;
    private final String explain;

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
    public void printInfo() {
        System.out.println(name + "|" + price + "|" + explain);
    }
}
