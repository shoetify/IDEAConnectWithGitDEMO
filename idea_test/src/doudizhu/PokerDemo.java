package doudizhu;

import java.util.*;

public class PokerDemo {
    private static HashMap<Integer, String> pokerMap = new HashMap<Integer, String>();

    public static void main(String[] args) {

        String[] color = {"♦", "♣", "♥", "♠"};
        String[] point = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        int count = 0;
        for (String i : color) {
            for (String j : point) {
                pokerMap.put(count, i + j);
                count++;
            }
        }
        pokerMap.put(52, "小王");
        pokerMap.put(53, "大王");

        ArrayList<Integer> poker = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            poker.add(i);
        }

        Collections.shuffle(poker);

        TreeSet<Integer> a1 = new TreeSet<>();
        TreeSet<Integer> a2 = new TreeSet<>();
        TreeSet<Integer> a3 = new TreeSet<>();
        TreeSet<Integer> a4 = new TreeSet<>();

        for (int i = 0; i < poker.size(); i++) {
            int temp = poker.get(i);
            if (i >= poker.size() - 3) {
                a4.add(temp);
            } else if (i % 3 == 0) {
                a1.add(temp);
            } else if (i % 3 == 1) {
                a2.add(temp);
            } else {
                a3.add(temp);
            }
        }

        print("A1",a1);
        print("A2",a2);
        print("A3",a3);
        print("底牌",a4);
    }

    public static void print(String s, TreeSet<Integer> ts) {
        System.out.println(s + "的牌是：");
        for (Integer i : ts) {
            System.out.print(pokerMap.get(i) + ' ');
        }
        System.out.println();
    }


}
