public class App {

    public static void main(String args[]){
        System.out.println("Hello");

        Account customer1 = new SavingAccount();

        customer1.deposit(700);
        customer1.getBalance();
        customer1.withdraw(200);
        customer1.getBalance();
        customer1.getAccountNumber();

        Account customer2 = new CurrentAccount();
        customer2.deposit(100);
        customer2.getBalance();
        customer2.withdraw(50);
        customer2.getBalance();
        customer2.getAccountNumber();




    }
}
