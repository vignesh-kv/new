import java.util.Scanner;

class saeq {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        // Input salary and age
        int salary = scan.nextInt();
        int age = scan.nextInt();
        
        // Check if eligible for loan based on salary or age
        if (salary >= 20000 || age <= 25) {
            System.out.println("You are eligible for loan");
            
            // Input loan amount
            int loan = scan.nextInt();
            
            // Check if loan is available
            if (loan < 50000) {
                System.out.println("Loan available");
            } else {
                System.out.println("Loan not available");
            }
        } else {
            System.out.println("You are not eligible for loan");
        }
        
        // Close the scanner
        scan.close();
    }
}
