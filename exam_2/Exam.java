
import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        oOrE();
        pOrC();
        number3();
        number4();
        number5();

    }
        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        static void oOrE() {
        System.out.println("1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
        int remainder;

        remainder = lastTwoDigits % 2;

        if ( remainder == 0) {
            System.out.println(lastTwoDigits + " is an even number");
        }
        else {
            System.out.println(lastTwoDigits + " is an odd number" );
        }
        }
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)
        static void pOrC() {
        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        boolean isPrime = true;
        
        if (lastDigit < 1) 
            System.out.println("Neither Prime nor Composite");
        else if (lastDigit == 1) 
            System.out.println("Neither Prime nor Composite");
        
        else {
            for ( int divisor = 2; divisor <= (lastDigit/2); divisor++) {
                  if ( (lastDigit % divisor) == 0) {
                        isPrime = false;
                        break;
             }
            }
        
            if (isPrime) 
            System.out.println(lastDigit + "is a Prime Number" );
            else 
            System.out.println(lastDigit + " is Composite Number");
        }
     }

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)

        static void number3() {

        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();

        System.out.println(firstName.length());
        
        System.out.print("Enter your surname: ");
        String surName = scan.next();

        System.out.println(surName.length());

        System.out.println(firstName.length() + surName.length());
    
    }



        static void number4() {
        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.

        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        int greater = Math.max(firstNumber, secondNumber);
        int greatest = greater;

        int z = Math.max(greatest, thirdNumber);

        System.out.println(z + " is the Largest number\n");
         } // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)

        static void number5() {
        System.out.println("5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();

        int stuNumber = studentNumber - 2022000000;

        System.out.println(stuNumber);
        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        int studentnumber = 2022104019;
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();
        
        
        if (studentnumber == studentNumber)
            System.out.println("Valid");
        else 
            System.out.println("Invalid");

        

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();

        if (firstName == firstName.toUpperCase()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }

        System.out.print("Enter your surname in lowercase: ");
        String surName = scan.next();

        if (surName == surName.toUpperCase()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }


        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();
      

        // If BSIT
             switch(course) {
                    case "BSIT":
                        System.out.println("You are part of the BSIT program\n");
                        System.out.print("Enter your specialization (MWAA or MAA): ");
                        String specialization1 = scan.next();
        
                        switch(specialization1){
                            case "MWAA":
                                System.out.println("Your specialization is MWAA\n");
                            break;
                            case "MAA":
                                System.out.println("Your specialization is MAA\n");
                            break;
                        }
        //If BSCS
                    break;
                    case "BSCS":
                        System.out.println("You are part of the BSCS program\n");
                        System.out.print("Enter your specialization (DF or ML): ");
                        String specialization2 = scan.next(); 
        
                        switch(specialization2) {
                            case "DF":
                            System.out.println("Your Specialization is DF\n");
                            break;
                            case "ML":
                            System.out.println("Your Specialization is ML\n");
                            break;
                        }
                    break;
                    default:
                    System.out.println("You are not currenty in any either program\n");
                    break;
        
                }
        
        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();

        switch (strand) {

            case "STEM":
            System.out.println("Valid");
            break;
            
            case "ICT":
            System.out.println("Valid");
            break;

            case "HUMSS":
            System.out.println("Valid");
            break;

            case "HOME ECONOMICS":
            System.out.println("Valid");
            break;

            case "ARTS AND DESIGN":
            System.out.println("Valid");
            break;

            case "TVL MARITIME":
            System.out.println("Valid");
            break;

            default:
            System.out.println("You entered not a Strand\n");
            break;
        }


        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        if (studentEmailAddress.contains("ogenacp") && studentEmailAddress.contains("@students.national-u.edu.ph")) {
            System.out.println("Valid");
        }
        else 
            System.out.println("Invalid");

        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Mystery method :-)

        // [Find the formula of method f(n) that accepts any positive integer n.]

        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3

        System.out.println("11. Mystery method! :-)");
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        int sum = 0;

        System.out.print("f(" + n + ") = ");

        for (int i = 1; i < n+1; i++) {
            if(i%2 != 0){
                sum += -i;
                System.out.print(-i);
            }
            else{
                sum += i;
                System.out.print(" + " + i);
            }
            System.out.print(" = " + sum);
        }
 
    
        // Close scanner
        scan.close();
    }
}
