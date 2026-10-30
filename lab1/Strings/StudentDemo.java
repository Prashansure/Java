class StudentDemo {
    int rollno;
    String name;
    String city;
    StudentDemo(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }
    // Overriding the toString() method
    public String toString() {
        return rollno + " " + name + " " + city;
    }
    public static void main(String args[]) {
        StudentDemo s1 = new StudentDemo(101, "Raj", "Lucknow");
        StudentDemo s2 = new StudentDemo(102, "Vijay", "Ghaziabad");

        System.out.println(s1); // internally calls s1.toString()
        System.out.println(s2); // internally calls s2.toString()
    }}
