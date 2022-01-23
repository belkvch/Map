package ex2;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>();
        treeMap.put("Джон Доу", 3434.34);
        treeMap.put("Том Смит", 123.22);
        treeMap.put("Джейн Бейкер", 1378.00);
        treeMap.put("Тод Халл", 99.22);
        treeMap.put("Ральф Смит", -19.05);
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = treeMap.get("Джон Доу");
        treeMap.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + treeMap.get("Джон Доу"));
    }
}
