public class TypeCastingDemo {
    public static void main(String[] args) {

        System.out.println("========== IMPLICIT CASTING (Widening) ==========\n");

        // byte -> short
        byte b = 10;
        short s = b;
        System.out.println("byte to short : " + b + " -> " + s);

        // short -> int
        short sh = 200;
        int i = sh;
        System.out.println("short to int : " + sh + " -> " + i);

        // int -> long
        int num = 5000;
        long l = num;
        System.out.println("int to long : " + num + " -> " + l);

        // long -> float
        long population = 150000;
        float f = population;
        System.out.println("long to float : " + population + " -> " + f);

        // float -> double
        float marks = 95.5f;
        double d = marks;
        System.out.println("float to double : " + marks + " -> " + d);

        // char -> int
        char grade = 'A';
        int ascii = grade;
        System.out.println("char to int : " + grade + " -> " + ascii);

        System.out.println("\n========== EXPLICIT CASTING (Narrowing) ==========\n");

        // double -> float
        double pi = 3.1415046069;
        float piFloat = (float) pi;
        System.out.println("double to float : " + pi + " -> " + piFloat);

        // float -> long
        float salary = 25000.75f;
        long salaryLong = (long) salary;
        System.out.println("float to long : " + salary + " -> " + salaryLong);

        // long -> int
        long distance = 12345234567886789L;
        int distanceInt = (int) distance;
        System.out.println("long to int : " + distance + " -> " + distanceInt);

        // int -> short
        int age = 32088800;
        short ageShort = (short) age;
        System.out.println("int to short : " + age + " -> " + ageShort);

        // short -> byte
        short value = 12000;
        byte valueByte = (byte) value;
        System.out.println("short to byte : " + value + " -> " + valueByte);

        // int -> byte (Overflow example)
        int number = 130;
        byte small = (byte) number;
        System.out.println("int to byte (Overflow) : " + number + " -> " + small);

        // int -> char
        int letterCode =1000;
        char letter = (char) letterCode;
        System.out.println("int to char : " + letterCode + " -> " + letter);

        System.out.println("\n========== SUMMARY ==========");

        System.out.println("Implicit Casting:");
        System.out.println("byte -> short -> int -> long -> float -> double");
        System.out.println("char -> int -> long -> float -> double");

        System.out.println("\nExplicit Casting:");
        System.out.println("double -> float -> long -> int -> short -> byte");
        System.out.println("int -> char");
    }
}