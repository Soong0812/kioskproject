package Lv4;
//Lv3 메뉴아이템 클래스 가져오기

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
    //getter 활용

    @Override
    public String toString() {
        return name + " " + price + " " + explain;
    }
    //생각하지 못하고 해당 코드 작성 없이 실행 시켰다가
    //메모리주소가 출력되는 문제를 마주하였는데
    //섹션 강의 듣고 Override로 해결
}
