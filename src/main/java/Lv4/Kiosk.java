package Lv4;

import java.util.ArrayList;
import java.util.List;

public class Kiosk {
    private List<Menu> menu;

    public Kiosk() {
        menu = new ArrayList<Menu>();

        Menu burger = new Menu("버거");
        burger.addMenuItem(new MenuItem("불고기버거", "8,900원", "불고기패티, 양상추, 토마토, 불고기소스, 양파"));
        burger.addMenuItem(new MenuItem("새우버거", "7,900원", "새우패티, 양상추, 양파, 마요네즈"));
        burger.addMenuItem(new MenuItem("치즈버거", "6,900원", "쇠고기패티, 양상추, 양파, 토마토, 체다치즈 2장"));
        burger.addMenuItem(new MenuItem("버섯버거", "6,900원", "쇠고기패티, 양상추, 양송이버섯, 양파, 트러플소스"));

        menu.add(burger);

        Menu drink = new Menu("음료");

    }
}
