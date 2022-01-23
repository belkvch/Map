package ex5;

import java.util.*;

public class TwoComparatorDepositors {
    public static void main(String[] args) {
        SurnameComp surnameComp = new SurnameComp();
        Comparator<String> compSurnameThenName = surnameComp.thenComparing(new NameComp());
        TreeMap<String, Double> tmDepositors = new TreeMap<String, Double>(compSurnameThenName);
        tmDepositors.put("Матвей Смирнов", -19.08);
        tmDepositors.put("Иван Петров", 3434.34);
        tmDepositors.put("Николай Снежков", 123.22);
        tmDepositors.put("Владимир Бейкер", 1378.00);
        tmDepositors.put("Николай Бейкер", 99.22);
        tmDepositors.put("Илья Смирнов", -20.08);
        tmDepositors.put("Матвей Артемьев", -21.08);
        Set<Map.Entry<String, Double>> set = tmDepositors.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = tmDepositors.get("Иван Петров");
        tmDepositors.put("Иван Петров", balance + 1000);
        System.out.println("Hoвый остаток на счете Иван Петров: " + tmDepositors.get("Иван Петров"));
    }
}
