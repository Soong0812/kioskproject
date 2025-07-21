package Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        drink.addMenuItem(new MenuItem("콜라", "3,000원", "코카콜라"));
        drink.addMenuItem(new MenuItem("사이다", "3,000원", "칠성사이다"));
        drink.addMenuItem(new MenuItem("환타", "3,500원", "오렌지맛"));
        drink.addMenuItem(new MenuItem("미란다", "2,500원", "파인애플맛"));

        menu.add(drink);
    }

    public void start () {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[카테고리를 선택하세요]");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).getCategory());
            }
            System.out.println("0. 종료");

            int menuChoice = scanner.nextInt();

            if (menuChoice == 0) {
                System.out.println("주문을 종료합니다.");
                break;
            }
            if (menuChoice < 1 || menuChoice > menu.size()) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            Menu selctMenu = menu.get(menuChoice - 1);
            System.out.println("[" + selctMenu.getCategory() + "]");
            selctMenu.showMenuItem();

            int itemChoice = scanner.nextInt();
            if (itemChoice < 1 || itemChoice > selctMenu.getMenuItem().size()) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            MenuItem choseItem = selctMenu.getMenuItem().get(itemChoice - 1);
            System.out.println("선택한 메뉴 : " + " " + choseItem.getName() + " " + choseItem.getPrice() + " " + choseItem.getExplain());
        }

        scanner.close();
    }
}
