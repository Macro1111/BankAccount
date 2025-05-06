import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("\nWelcome dear user. Please enter your name: ");
        String userName = keyboard.nextLine();
        Account account = new Account(userName);

        while (true){
            System.out.print("\nPlease select an option:\n" +
                    "\n" +
                    "1. To deposit into the account\n" +
                    "2. To withdraw from the account\n" +
                    "\n" +
                    "0. To exit\n"+
                    "\n" +
                    "Enter the option here: ");

            int option = keyboard.nextInt();

            switch (option){
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    Double amountIncrease = keyboard.nextDouble();
                    account.deposit(amountIncrease);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    Double amountDecrease = keyboard.nextDouble();
                    account.withdraw(amountDecrease);
                    break;
                case 0:
                    System.out.println("Thank you for visiting us. The final amount in your account is: "+ account.amount);
                    return;
                default:
                    System.out.println("The entered option is not valid.");
            }
        }
    }
}
