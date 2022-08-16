public abstract class Account {
// How to set up an account.
    static int accountNumber = 0 ; // Using static as i want  the number to be  dynamic when each account is created
    double balance;

// default constructor is being used when the account is created incrementing the account number by one and  balance set as 0
    public Account(){
        this.accountNumber += 1;
        balance = 0.0;
    }
    //getters

    public void getBalance(){
        System.out.println(" This is the balance  from Account"  + this.balance) ;

    }

    public void getAccountNumber(){
        System.out.println("The account number for this customer is " + this.accountNumber);
    }

    //Abstact method to be used by the child class sub account.
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);


}
