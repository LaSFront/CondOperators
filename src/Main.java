public class Main {

    public static void main(String[] args) {
        int b = 923; // рублей, остаток на счете
        int a = 1863; // рублей, сумма пополнения
        int min = 1001; //рублей, минимальная для акции сумма пополнения

        int bonus;
        if (a >= min) {
            bonus = a / 100;
        }
        else {
            bonus = 0;
        }
        System.out.println("На Ваш счет поступило " + a + " руб.");
        System.out.println("Вам начислено " + bonus + " бонусов");
        System.out.println("На Вашем счету " + (b + a + bonus) + " руб.");
    }
}
