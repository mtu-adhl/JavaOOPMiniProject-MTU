package GameObjects;

import java.io.Serializable;

public class Inventory implements Serializable {
    private int grade;
    private int size;
    private Item[] items;

    public Inventory(int grade) {
        setGrade(grade);
        switch (grade){
            case 1: setSize(1);
            case 2: setSize(2);
            case 3: setSize(4);
        }
        this.items = new Item[size];
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("inventory={" +
                "\n\t\tgrade=" + grade +
                ", vacantSpace=" + this.vacantSpace() +
                ", size=" + size +
                "\n\t\titems=\n");
        for (Item item : items) {
            if (item != null) output.append("\t\t\t").append(item).append("\n");
        }
        return output.append("\t}").toString();
    }

    public int vacantSpace(){
        int count = size;
        for (Item item:
             items) {
            if (item != null) {
                count--;
            }
        }
        return count;
    }

    public void addItem(Item target){
        if (vacantSpace() > 0) {
            for (int i = 0; i < size; i++) {
                if (items[i] == null) {
                    items[i] = target;
                    break;
                }
            }
        }
    }
    public void dropItem(Item target){
        Item[] temp = new Item[size];
        for (int i = 0; i < size; i++) {
            if (items[i] != target) {
                temp[i] = items[i];
            }
        }
        setItems(temp);
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Item[] getItems() {
        return items;
    }
    public void setItems(Item[] items) {
        this.items = items;
    }
}
