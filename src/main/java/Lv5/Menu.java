package Lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    private List<MenuItem> menuItem;

    public Menu(String category) {
        this.category = category;
        this.menuItem = new ArrayList<MenuItem>();
    }

    public String getCategory() {
        return category;
        }
    public void setCategory(String category) {
        this.category = category;
    }

    public List<MenuItem> getMenuItem() {
        return menuItem;
        }
    public void setMenuItem(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }
    //getter/setter 메서드

    public void addMenuItem(MenuItem item) {
        menuItem.add(item);
    }

    public void showMenuItem() {
        for (int i = 0; i < menuItem.size(); i++) {
            System.out.println((i + 1) + ". " + menuItem.get(i));
        }
    }
    //메뉴 리스트 순차적으로 출력
}
