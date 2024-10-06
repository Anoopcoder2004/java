import java.util.Scanner;

class iveStudent {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void readDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Result extends Student {
    private int[] marks;

    public Result(String name, int rollNumber) {
        super(name, rollNumber);
        marks = new int[5]; // Assuming 5 subjects
    }

    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public void calculateGrade() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        if (totalMarks >= 400) {
            System.out.println("Total Grade: A");
        } else if (totalMarks >= 300) {
            System.out.println("Total Grade: B");
        } else {
            System.out.println("Total Grade: C");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();

        Result student = new Result(name, rollNumber);
        student.readMarks();

        System.out.println("\nStudent Details:");
        student.displayDetails();
        student.calculateGrade();
    }
}
