package Account;

class Account{
    String accountNumber;
    String accountType;
    int amount;

    public boolean withdrawAmount(int amt){
        if(amt>amount) {
            return false;
        }else {
            amount = amount-amt;
            return true;
        }
    }

}
public class Main {
    public static void main(String[] args) {

        Account obj = new Account();
        obj.amount = 500;
        obj.withdrawAmount(50);

        System.out.println(obj.amount);
    }
}