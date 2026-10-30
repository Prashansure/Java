class Student {
    int rollnumber;
    String name;
    int math;
    int java;
    int dbms;

    Student(int rollnumber, String name, int math, int java, int dbms) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.math = math;
        this.java = java;
        this.dbms = dbms;
    }

    int total() {
        return math + java + dbms;
    }

    double avg() {
        return total() / 3.0;
    }

    void result(int a, int b, int c, int d) {
        if (a >= 40 && b >= 40 && c >= 40 && d >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    void display() {
        System.out.println("The name is: " + name + ", the roll number is: " + rollnumber);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", 40, 40, 50);
        Student s2 = new Student(2, "Bob", 35, 45, 60);
        Student s3 = new Student(3, "Charlie", 50, 60, 70);

        s1.display();
        s1.result(40, 40, 40, 50);

        System.out.println("Total: " + s1.total());
        System.out.println("Average: " + s1.avg());
    }
}
