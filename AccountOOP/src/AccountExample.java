public class AccountExample {
    public static void main(String[] args) {
        Account account1 = new Account("Pepe");
        Account account2 = new Account("Jose", 100);

        System.out.println(account1);
        System.out.println(account2);

        account1.enterMoney(202);
        System.out.println(account1);
        account2.withdrawMoney(20);
        System.out.println(account2);
    }
}
