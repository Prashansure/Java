public class Op_pre {
    public static void main(String[] args)
    {
        int a =1,b =5,c =2;
        int result = a+b*c;
        System.out.println("the result is: " + result);
        int result1 = a+(b*c);
        System.out.println("the result is: " + result1);
        int result2 = (a+b)*c;
        System.out.println("the result is: " + result2);
        int result3 = a+b/c;
        System.out.println("the result is: " + result3);
        int result4 = a-b+c*4/2;
        System.out.println("the result is: " + result4);

    }
    
}
