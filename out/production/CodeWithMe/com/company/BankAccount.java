import java.util.Scanner;


class BankAccount {

        int acc_no = 0;
        int balance;
        String acc_type;
        String name;
        Scanner sc = new Scanner(System.in);

        public void createAccount() {
                System.out.println("New Account is creating..");
                acc_no++;
                System.out.println("Enter your name :");
                name = sc.nextLine();

                System.out.println("Enter Type of account  \n 1.Saving \n 2.Currrent");
                acc_type = sc.nextLine();

                System.out.println("New account is created");
                System.out.println("Account number is : " + acc_no);
                

        }

        public void deposit() {

                System.out.println("Enter The Ammount for Deposit: ");
                int deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Balance Updated..");
                

        }

        public void balanceEnquiry() {

                System.out.println("Balanse is "+balance);
                System.out.println("Account Number is "+acc_type);
                System.out.println("Customer name is :"+ name);

        }

}
