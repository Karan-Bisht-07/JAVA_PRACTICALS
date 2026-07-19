
import java.util.Scanner;
public class EmployeeSalarySlip {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.12;

        double grossSalary = basicSalary + hra + da;
        double netSalary = grossSalary - pf;

        System.out.println("\n===== SALARY SLIP =====");

        System.out.printf("Basic Salary : Rs. %.2f\n", basicSalary);
        System.out.printf("HRA (20%%) : Rs. %.2f\n", hra);
        System.out.printf("DA (10%%) : Rs. %.2f\n", da);
        System.out.printf("PF (12%%) : Rs. %.2f\n", pf);
        System.out.printf("Gross Salary : Rs. %.2f\n", grossSalary);
        System.out.printf("Net Salary : Rs. %.2f\n", netSalary);

        
    }
    
}
