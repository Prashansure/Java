interface Mother
{
    float wt = 65.5f;
    void weight();
}

class child implements Mother
{
    public void weight()
    {
        System.out.println("mother weight is " + Mother.wt);
    }

    public static void main(String[] args)
    {
        System.out.println("mother weight is " + Mother.wt);
    }
}

class Family
{
    public static void main(String[] args)
    {
        child ob = new child();
        ob.weight();
    }
}