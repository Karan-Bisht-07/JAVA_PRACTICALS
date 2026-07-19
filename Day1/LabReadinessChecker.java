import java.util.Scanner;

public class LabReadinessChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentName;
        String labName;

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Laboratory Name: ");
        labName = sc.nextLine();

        System.out.println("\n===== JAVA LAB READINESS CHECK =====");
        System.out.println("Student Name : " + studentName);
        System.out.println("Laboratory   : " + labName);
        System.out.println("Status       : Java Environment is Ready.");
        System.out.println("Compile      : javac LabReadinessChecker.java");
        System.out.println("Run          : java LabReadinessChecker");

        sc.close();
    }
}