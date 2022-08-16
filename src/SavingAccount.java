import jdk.swing.interop.SwingInterOpUtils;

public class SavingAccount extends Account{

    int savingTransaction = 0;
    int withdrawTransaction = 0;

//  default constructor is using the parent

    public SavingAccount(){
        super();
    }

//    public SavingAccount(int accountNumber, double balance){
//
//    }
// depoist the money if the amount is  greater than 0 also  making a note of  the number of saving transactions
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        } else{
            System.out.println("Please enter a valid amount");
        }
        savingTransaction += 1;
    }
// this is allowing  you  to withdraw from the  saving account  ensuring a min of 500  is in the account and amount entered it more than  0  also making a note of the transaction
    public void withdraw(double amount){
        if (amount > 0 && balance > 500.00 ){
            balance -= amount;
        } else {
            System.out.println("Error please contact customer support : ) ");
        }
        withdrawTransaction  += 1;
    }
    //This method is not being called right now  but the idea is  that intrest is given on  keeping  the money in this account  as long as tjhe  saving   transation is more than
    // withdraws
    public void intrest(){
        if(savingTransaction > withdrawTransaction){
            balance *= 1.5;
        }
    }
    @Override
    public void getBalance(){
        System.out.println(" This is the balance Saving account "  + this.balance) ;

    }


}
