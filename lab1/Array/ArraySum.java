class ArraySum
{
    public static void main(String args[])
    {
        int[] marks = {80, 90, 70, 60, 100};
        int sum = 0;
        for(int i = 0; i < marks.length; i++)
        {
            sum = sum + marks[i];
        }
        double average = (double)sum / marks.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
