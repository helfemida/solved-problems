package homework2.encapsulation;

public class Onay {

    private String owner;
    private int discount;
    private double balance;

    public Onay(String owner, String type) {
        this.owner = owner;
        if (type.equalsIgnoreCase("pensioner")
                || type.equalsIgnoreCase("children")) {
            this.discount = 70;
        } else if (type.equalsIgnoreCase("student")) {
            this.discount = 40;
        } else {
            this.discount = 0;
        }
    }

    public void chargeBalance(int amount) {
        this.balance += amount;
    }

    public int amountOfRides() {
        return (int) this.balance / (100 - discount);
    }

    public void payForRide() {
        balance -= (100 - discount);
    }
    public String toString(){
        return "Owner:" + this.owner +
                "\n balance: " + this.balance +
                "\n rides left: " + amountOfRides() +
                " discount: " + this.discount;
    }

}
