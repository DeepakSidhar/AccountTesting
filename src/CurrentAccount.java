public class CurrentAccount extends Account {
//  default  constructor used by Super Account.
    public CurrentAccount(){
        super();
    }
// deposit money into the account . Amount has to be more the  0
    public void deposit(double amount){
        if(amount > 0 ){
            balance += amount;
        }

    }
// Withdraw from the  current account - No over  draft limit so if money is in the account and  amount is more than 0 you can withdraw
    public void withdraw(double amount){
        if(amount > 0 && balance > amount){
            balance -= amount;
        }
    }

    @Override
    public void getBalance(){
        System.out.println(" This is the balance of current account "  + this.balance) ;

    }




}
