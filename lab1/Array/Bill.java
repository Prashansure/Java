package lab1.Array;

import java.util.Scanner;

class Bill
{
    public static void main(String[] args)
    {
        int dCharge = 0,pAmount;
        double discount,cashback = 0,fAmount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        pAmount = sc.nextInt();
        if (pAmount >= 10000)
        {
            discount = pAmount * 0.2;
        }
        else if (pAmount >= 5000)
        {
            discount = pAmount * 0.15;
        }
        else if (pAmount >= 2000)
        {
            discount = pAmount * 0.1;
        }
        else
        {
            discount = 0.0;
        }
        if (discount > 5000)
        {
            cashback = pAmount * 0.05;
        }
        fAmount = pAmount - discount - cashback;
        if (fAmount < 3000)
        {
            dCharge = 100;
            fAmount += 100.0;
        }
        System.out.println("Original Amount: " + pAmount);
        System.out.println("Discounted Amount " + discount);
        System.out.println("Cashback " + cashback);
        System.out.println("Delivery Charge " + dCharge);
        System.out.println("Final Payable Amount " + fAmount);
    }
}
    