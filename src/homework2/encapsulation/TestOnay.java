package homework2.encapsulation;

import homework2.encapsulation.Onay;

import java.util.Scanner;

public class TestOnay {
    /*
        В данном задании ваша задача симплементировать Онай карточку.
        По скидочной программе у пользователей со статусом "Student" скидка в 40 процентов,
        у пожилых "Pensioner" и детей "Children" скидка 70 процентов.

        Методы:
            payForRide() - оплачивает за проезд с учетом скидки. -100
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
        |   String)              | ++++
        | + payForRide()         | ++++
        | + amountOfRides(): int | ++++
        | + getOwner(): String   |
        | + getDiscount(): int   |
        | + getBalance(): double |
        | + chargeBalance(amount:|
        |    double)             |
        | + toString(): String   |
        |------------------------|

     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       String name = in.nextLine();
       String type = in.next();
       int balance = in.nextInt();

       Onay onay = new Onay(name, type);
       onay.chargeBalance(balance);

        testOnay(onay);

        System.out.println(onay);

    }
    private static void testOnay(Onay onay){
        System.out.println(onay.toString());
        while(onay.amountOfRides() > 0){
            onay.payForRide();
        }
        onay.chargeBalance(125);
    }
}
