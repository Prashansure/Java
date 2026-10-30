class BankAccount {
    int accountNumber;
    String customerName;
    double balance;

    BankAccount(int num, String name)
    {
        this.accountNumber = num;
        this.customerName = name;
        this.balance = 0.0;
    }

    void deposit(double amount)
    {
        balance += amount;
        System.out.println("Amount of " + amount + " has been deposited.");
    }

    void withdraw(double amount)
    {
        if (this.balance < amount)
        {
            System.out.println("Insufficient Balance.");
        }
        else
        {
            this.balance -= amount;
            System.out.println("Withdrawn.");
        }
    }

    void displayBalance()
    {
        System.out.println("User:" + this.customerName + "\nBalance: " + this.balance);
    }

    public static void main(String[] args)
    {
        BankAccount obj1 = new BankAccount(100,"Datta");
        BankAccount obj2 = new BankAccount(101,"Hemanth");
        obj1.deposit(1000.0);
        obj2.withdraw(500.0);
        obj1.withdraw(150.0);
        obj2.deposit(10000.0);
        obj1.displayBalance();
        obj2.displayBalance();
    }
}
