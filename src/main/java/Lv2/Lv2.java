package Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lv2 {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("1. 불고기버거", "8,900원", "불고기패티, 양상추, 토마토, 불고기소스, 양파"));
        menuItems.add(new MenuItem("2. 새우버거", "7,900원", "새우패티, 양상추, 양파, 마요네즈"));
        menuItems.add(new MenuItem("3. 치즈버거", "6,900원", "쇠고기패티, 양상추, 양파, 토마토, 체다치즈 2장"));
        menuItems.add(new MenuItem("4. 버섯버거", "6,900원", "쇠고기패티, 양상추, 양송이버섯, 양파, 트러플소스"));
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("[햄버거 메뉴]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem menuItem = menuItems.get(i);
                System.out.println(menuItem.getName() + "|" + menuItem.getPrice() + "|" + menuItem.getExplain());
            }
            System.out.println("0. 주문 종료");
            System.out.println("원하시는 메뉴의 번호를 입력하세요\n종료를 원하시면 0을 입력하세요");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("주문을 종료합니다");
                run = false;
            } else  if (choice > 0 && choice <= menuItems.size()) {
                MenuItem menuItem = menuItems.get(choice - 1);
                System.out.println("[선택한 메뉴]");
                System.out.println(menuItem.getName() + "|" + menuItem.getPrice() + "|" + menuItem.getExplain());
            }
        }

        scanner.close();
    }
}
