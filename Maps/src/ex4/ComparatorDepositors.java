package ex4;

import java.util.*;

public class ComparatorDepositors {
    public static void main(String[] args) {
        TreeMap<String, Double> tmDepositors = new TreeMap<String, Double>(new SurnameComp());
        tmDepositors.put("Матвей Смирнов", -19.08);
        tmDepositors.put("Иван Петров", 3434.34);
        tmDepositors.put("Николай Снежков", 123.22);
        tmDepositors.put("Владимир Бейкер", 1378.00);
        tmDepositors.put("Николай Бейкер", 99.22);
        tmDepositors.put("Илья Смирнов", -19.08);
        tmDepositors.put("Матвей Артемьев", -19.08);
        Set<Map.Entry<String, Double>> setDepositors = tmDepositors.entrySet();
        for (Map.Entry<String, Double> me : setDepositors) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = tmDepositors.get("Иван Петров");
        tmDepositors.put("Иван Петров", balance + 1000);
        System.out.println("Новый остаток на счете Иван Петров: " + tmDepositors.get("Иван Петров"));
    }
}
