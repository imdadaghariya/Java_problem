import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {

    }
}
class Account{
    public int bal;
    public Account(int bal)
    {
        this.bal = bal;
    }
    public boolean isBalanceSufficent(int w)
    {
        if(bal>w)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    public void withdraw(int amt)
    {
        bal = bal-amt;
        System.out.println("The Ammount is "+amt);
        System.out.println("YOUR current balance is "+bal);
    }

}           
class Coustomer
{
    private Account account;
    public Coustomer(Account account)
    {
        this.account = account;

    }
    public void run()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the ammount ");
        int amt = sc.nextInt();

    }
}