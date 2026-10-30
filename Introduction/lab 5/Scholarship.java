class Scholarship
{
    public static void main(String []args)
    {
        int perc = 90;
        int atten = 0;
        int income = 400000;
        if(perc >=80 && atten >=75 && income <=500000)
        {
            if(perc >=90 && atten >=90 && income <=500000)
            {
                System.out.println("Eligible for full scolarship");
            }
            else if(perc >=85 && atten >=85 && income <=500000)
            {
                System.out.println("Eligible for 60% scolarship");

            }
            else
            {
                System.out.println("eligible for 40% scolarship");
            }
        }
        else
        {
            System.out.println("Not eligible for scolarship");
        }

    }
}