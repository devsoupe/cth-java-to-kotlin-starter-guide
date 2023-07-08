package com.devsoupe.lec04;

public class Lec04Main {

    public static void main(String[] args) {
        practice_1();
        practice_2();
        practice_3();
        practice_4();
    }

    private static void practice_1() {
        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = new JavaMoney(2_000L);

        System.out.println(money1.plus(money2));
    }

    private static void practice_2() {
        JavaMoney money1 = new JavaMoney(2_000L);
        JavaMoney money2 = new JavaMoney(1_000L);

        if (money1.compareTo(money2) > 0) {
            System.out.println("Money1이 Money2보다 금액이 큽니다.");
        }
    }

    private static void practice_3() {
        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = money1;
        JavaMoney money3 = new JavaMoney(1_000L);

        System.out.println(money1 == money2);
        System.out.println(money1 == money3);
        System.out.println(money1.equals(money3));
    }

    private static void practice_4() {
        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = new JavaMoney(2_000L);

        System.out.println(money1.plus(money2));
    }

}
