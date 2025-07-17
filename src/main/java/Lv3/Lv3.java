package Lv3;

import java.util.ArrayList;
import java.util.List;

public class Lv3 {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("1. 불고기버거", "8,900원", "불고기패티, 양상추, 토마토, 불고기소스, 양파"));
        menuItems.add(new MenuItem("2. 새우버거", "7,900원", "새우패티, 양상추, 양파, 마요네즈"));
        menuItems.add(new MenuItem("3. 치즈버거", "6,900원", "쇠고기패티, 양상추, 양파, 토마토, 체다치즈 2장"));
        menuItems.add(new MenuItem("4. 버섯버거", "6,900원", "쇠고기패티, 양상추, 양송이버섯, 양파, 트러플소스"));

        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();
    }
}
