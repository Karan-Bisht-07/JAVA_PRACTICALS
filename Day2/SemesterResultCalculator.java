
import java.util.Scanner;
public class SemesterResultCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, m5;

        System.out.print("Enter marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        m5 = sc.nextInt();

        if (m1 < 0 || m1 > 100 ||
            m2 < 0 || m2 > 100 ||
            m3 < 0 || m3 > 100 ||
            m4 < 0 || m4 > 100 ||
            m5 < 0 || m5 > 100) {

            System.out.println("Invalid marks! Please enter marks between 0 and 100.");
        } else {

            int total = m1 + m2 + m3 + m4 + m5;
            double percentage = total / 5.0;

            System.out.println("\n===== SEMESTER RESULT =====");
            System.out.println("Total Marks : " + total + " / 500");
            System.out.printf("Percentage : %.2f%%\n", percentage);

            if (percentage >= 40)
                System.out.println("Result : PASS");
            else
                System.out.println("Result : FAIL");
        }

        sc.close();
    }
    
}
