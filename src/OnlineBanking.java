import java.util.Random;
public class OnlineBanking {
    long accountNumber;
    String accountHolderName;
    double accountBalance;
    String accountStatus;
    OnlineBanking(String accountHolderName,double accountBalance,String accountStatus){
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        accountNumber = autoGenerateNo();
        System.out.println(accountNumber);
        this.accountStatus = accountStatus;

    }
    public long autoGenerateNo() {
        Random obj = new Random();

      long accountNumber = obj.nextLong(100000000000L,999999999999L);
        return  accountNumber;
    }

    public double  withdrawCash(int withdrawlAmount){
       double availableBalance = 0.0;
        if(withdrawlAmount < accountBalance) {
            availableBalance = accountBalance - withdrawlAmount;

        }
        return availableBalance;
    }
    public double checkBalance() {

        return  accountBalance;

    }
    public double depositCash(int depositAmount){
        double availableBalance = 0.0;
       
            availableBalance = accountBalance + depositAmount;
        
        return availableBalance;
    }
    public double  transferFunds(int transferAmount){

        double availableBalance = 0.0;
        if(transferAmount < accountBalance){
            availableBalance = accountBalance - transferAmount;
        }
        return  availableBalance;
    }

}
