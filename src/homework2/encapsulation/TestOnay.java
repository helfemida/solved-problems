package homework2.encapsulation;

import homework2.encapsulation.Onay;

public class TestOnay {
    /*
        В данном задании ваша задача симплементировать Онай карточку.
        По скидочной программе у пользователей со статусом "Student" скидка в 40 процентов,
        у пожилых "Pensioner" и детей "Children" скидка 70 процентов.

        Методы:
            payForRide() - оплачивает за проезд с учетом скидки.
            amountOfRides(): int - возвращает оставшееся количество проездов
            chargeBalance(amount: double) - пополняет баланс на сумму amount
            toString() - возвращает описание онайки в формате:
                    "Owner: Apa
                    balance: 5000.0
                    rides left: 166
                    discount: 70"
         ________________________
        |        Onay            |
        |------------------------|
        | - owner: String        |
        | - discount: int        |
        | - balance: double      |
        |------------------------|
        | + Onay(cardHolder:     |
        |   String, holderType:  |
        |   String)              |
        | + payForRide()         |
        | + amountOfRides(): int |
        | + getOwner(): String   |
        | + getDiscount(): int   |
        | + getBalance(): double |
        | + chargeBalance(amount:|
        |    double)             |
        | + toString(): String   |
        |------------------------|

     */
    public static void main(String[] args) {
        Onay onay1 = new Onay("Albina", "student");
        Onay onay2 = new Onay("Apa", "pensioner");
        Onay onay3 = new Onay("John", "regular");

        onay1.chargeBalance(999);
        onay2.chargeBalance(5000);
        onay3.chargeBalance(3123);

        testOnay(onay1);
        testOnay(onay2);
        testOnay(onay3);

        System.out.println(onay1);
        System.out.println(onay2);
        System.out.println(onay3);

    }
    private static void testOnay(Onay onay){
        System.out.println(onay.toString());
        while(onay.amountOfRides() > 0){
            onay.payForRide();
        }

        onay.chargeBalance(125);
    }
}
