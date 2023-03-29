import java.util.Scanner;
public class java_switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read age from the user
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        switch (marks/10) {
            case 5:
                System.out.println("Your Grade is 'D' and CGP is between 2.00-2.57");break;
            case 6:
                System.out.println("Your Grade is 'C' and CGPA is between 2.70-2.99");break;
            case 7:
                System.out.println("Your Grade is 'B' and CGPA is between 3.00-3.29");break;
            case 8:
                System.out.println("Your Grade is 'B+' and CGPA is between 3.30-3.69");break;
            case 9:
                System.out.println("Your Grade is 'A' and CGPA is between 3.70-3.99");break;
            case 10:
                System.out.println("Your Grade is 'A+' and CGPA is between 4");break;
            default:
                System.out.println("Your Grade is 'F' and CGPA is below 2.00");break;
        }

    }
}
