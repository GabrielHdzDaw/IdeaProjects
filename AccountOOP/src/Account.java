public class Account {
    String owner;
    double amount;

    public Account(String owner) {
        this(owner, 0);
    }

    public Account(String owner, double amount){
        this.owner = owner;
        this.amount = amount;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOwner(){
        return owner;
    }

    public double getAmount(){
        return amount;
    }

    public void enterMoney(double amount) {
        if (amount > 0){
            this.amount += amount;
            System.out.println(owner + " account + " + amount);
        }
    }

    public void withdrawMoney(double amount) {
        if (this.amount - amount >= 0){
            this.amount -= amount;
            System.out.println(owner + " account - " + amount);
        }
    }

    @Override
    public String toString(){
        return String.format("%s has $%.2f", owner, amount);
    }
}
