package ex1;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hashMapDepositors = new HashMap<>();
        hashMapDepositors.put("Джoн Доу", 3432.32);
        hashMapDepositors.put("Toм Смит", 123.22);
        hashMapDepositors.put("Джейн Бейкер", 1378.00);
        hashMapDepositors.put("Toд Холл", 99.55);
        hashMapDepositors.put("Paльф Смит", -19.08);

        Set<Map.Entry<String, Double>> setDepositors = hashMapDepositors.entrySet();
        for (Map.Entry<String, Double> me : setDepositors) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hashMapDepositors.get("Джoн Доу");
        hashMapDepositors.put("Джoн Доу", balance + 1000);
        System.out.println("Hoвый остаток на счете Джона Доу: " + hashMapDepositors.get("Джoн Доу"));
    }
}
