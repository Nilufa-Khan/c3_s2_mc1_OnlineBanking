import java.util.Scanner;
public class OnlineBankingImpl {
    public static void main(String[] args) {
        OnlineBanking obj = new OnlineBanking("Aashna",5000,"Active");
        System.out.println("Name of the account holder = " + obj.accountHolderName);
        System.out.println("Account status = "+ obj.accountStatus);
        System.out.println("Balance Check = "+obj.checkBalance());
        System.out.println("After Withdrawl amount = "+obj.withdrawCash(500));

        System.out.println("After Deposit amount = "+obj.depositCash(3000));
        System.out.println("Fund transfer = "+obj.transferFunds(2000));
    }
}
