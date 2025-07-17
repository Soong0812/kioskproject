package Lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<MenuItem> menuItems;
    private final Scanner scanner;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
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
            } else {
                System.out.println("잘못된 번호를 입력하셨습니다\n다시 입력해주세요.");
            }
        }
    }
}
