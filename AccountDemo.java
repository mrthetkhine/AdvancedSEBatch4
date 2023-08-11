class Account
{
    private int balance = 0;

    public void debit(int amount)
    {
        if(this.balance >= amount && amount >=0)
        {
            this.balance -= amount;
        }
        
    }
    public void credit(int amount)
    {
        if(amount>=0)
        {
            this.balance += amount;
        }
        
    }
    public int getBalance()
    {
        return this.balance;
    }
}
class User
{
    private Account account;
    public Account getAccount()
    {
        return this.account;
    }
    public void setAccount(Account account)
    {
        this.account = account;
    }
}
public class AccountDemo
{
    public static void main(String[]args)
    {
        Account account = new Account();
        account.credit(100);
        account.debit(40);

        System.out.println("Balance "+account.getBalance());
    }
}