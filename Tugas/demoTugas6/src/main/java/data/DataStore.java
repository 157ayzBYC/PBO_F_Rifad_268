package data;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private static List<Item> items = new ArrayList<>();

    public static void addItem(Item item) {
        items.add(item);
    }

    public static List<Item> getItems() {
        return items;
    }
}


