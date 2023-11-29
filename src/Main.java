public class Main {
    public static void main(String[] args) {
        int balance = 250; // сумма начального счёта
        int money = 1300; // сумма пополнения
        int threshold = 100; // порог для 1 бонуса

        if (money > 1000) {
            int finalbalance = balance + money; // итоговый баланс после пополнения
            int bonus = money / threshold; // количество бонусных рублей
            System.out.println(finalbalance + " итоговый счет");
            System.out.println(bonus + " бонусных рублей");
        } else {
            int finalbalance = balance + money; // итоговый баланс после пополнения
            int bonus = 0; // количество бонусных рублей
            System.out.println(finalbalance + " итоговый счет");
            System.out.println(bonus + " бонусных рублей");
        }
    }
}
