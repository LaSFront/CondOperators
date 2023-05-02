public class Main {

    public static void main(String[] args) {
        int balance = 923; // рублей, остаток на счете
        int amount = 1863; // рублей, сумма пополнения

        int bonus;
        if (amount >= 1001) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("На Ваш счет поступило " + amount + " руб.");
        System.out.println("Вам начислено " + bonus + " бонусов.");
        System.out.println("На Вашем счете " + (balance + amount + bonus) + " руб.");
    }
}
