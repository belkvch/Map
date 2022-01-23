package ex3;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>(new CompStringReverse());
        treeSet.add("Специалист по сетевому обеспечению");
        treeSet.add("Системный аналитик");
        treeSet.add("Программист");
        treeSet.add("Системный администратор");
        treeSet.add("Специалист по поддержке пользователей");
        treeSet.add("Руководитель отдела информационных технологий");
        treeSet.add("Веб-мастер");
        for (String element : treeSet)
            System.out.println(element + " ");
    }
}
