import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        String[][] students = new String[5][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i+1) + ":");
            System.out.print("Name: ");
            students[i][0] = scanner.nextLine();
            System.out.print("Age: ");
            students[i][1] = scanner.nextLine();
            System.out.print("Roll no: ");
            students[i][2] = scanner.nextLine();
            System.out.print("Grade: ");
            students[i][3] = scanner.nextLine();
            System.out.print("Mark: ");
            students[i][4] = scanner.nextLine();
        }
        System.out.println("\nDetails of all students:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i+1) + " details:");
            System.out.println("Name: " + students[i][0]);
            System.out.println("Age: " + students[i][1]);
            System.out.println("Roll no: " + students[i][2]);
            System.out.println("Grade: " + students[i][3]);
            System.out.println("Marks " + students[i][4]);
            System.out.println();
        }
        scanner.close();
    }
}