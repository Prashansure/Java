class Student {
    public static void main(String[] args) {

        int marks = 95;
        int dep = 2;

        // Simple if-else
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Else-if Ladder (Grade)
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Grade F");
        }

        // Nested if
        if (marks >= 50) {
            if (marks >= 80) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }
        } else {
            System.out.println("Not Eligible");
        }

        // Switch Case
        switch (dep) {
            case 1:
                System.out.println("CSE");
                break;

            case 2:
                System.out.println("CSE AIML");
                break;

            default:
                System.out.println("You are not from this college");
        }
    }
}