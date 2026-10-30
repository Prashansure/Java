class Student {
    Student(int id, String name) {
        System.out.println("Student ID is " + id + " and name is " + name);
    }
}

class Test {
    public static void main(String[] args) {
        Student obj[] = new Student[3];

        obj[0] = new Student(1, "Bharat");
        obj[1] = new Student(2, "Vivaan");
        obj[2] = new Student(3, "Smith");
    }
}