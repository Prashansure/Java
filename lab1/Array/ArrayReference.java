class ArrayReference {
    public static void main(String args[]) {
        int a[] = {10, 20, 30};
        int b[];
        b = a;
        b[0] = 100;

        System.out.println("a[0] = " + a[0]);
        System.out.println("b[0] = " + b[0]);
    }
}
