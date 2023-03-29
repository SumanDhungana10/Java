import java.util.Scanner;
public class javaifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read age from the user
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        int votingage = 18;
        if(age<10)
        {
            System.out.println("You are children");
        }
        else if(age<votingage){
            System.out.println("You are under age");
        }
        else {
            System.out.println("You can vote");
        }
        input.close();

    }
}

