package Lv1;

import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("[햄버거]");
            System.out.println("1. 불고기버거  | 8,900원 | : 불고기패티, 양상추, 토마토, 불고기소스, 양파");
            System.out.println("2. 새우버거    | 7,900원 | : 새우패티, 양상추, 양파, 마요네즈");
            System.out.println("3. 치즈버거    | 6,900원 | : 쇠고기패티, 양상추, 양파, 토마토, 체다치즈 2장");
            System.out.println("4. 버섯버거    | 6,900원 | : 쇠고기패티, 양상추, 양송이버섯, 양파, 트러플소스");
            System.out.println("0. 종료       |종      료|");

            System.out.println("메뉴를 선택하세요 : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("불고기 버거는 8,900원입니다.");
                    break;
                case 2:
                    System.out.println("새우버거는 7,900원입니다.");
                    break;
                case 3:
                    System.out.println("치즈 버거는 6,900원입니다.");
                    break;
                case 4:
                    System.out.println("버섯 버거는 6,900원입니다.");
                    break;
                case 0:
                    System.out.println("주문을 종료합니다.");
                    run = false;
                    break;
            }
        }
        scanner.close();
    }
}