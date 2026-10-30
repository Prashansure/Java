import java.util.Scanner;

class StudentMarks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3;
        double total, percentage;

        System.out.print("Enter Marks in Java : ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks in Python : ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks in C : ");
        m3 = sc.nextInt();

        total = m1 + m2 + m3;
        percentage = total / 3;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);

        sc.close();
    }
}