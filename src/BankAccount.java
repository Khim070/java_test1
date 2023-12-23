import java.util.Scanner;

class BankAccount{
    private String AccoutNumber = "500 292 906";
    private Double Balance = Double.valueOf("1000");
    private String CustomerName = "LEANG Vakhim";
    private  String Email = "vakhiml60@gmail.com";
    private String PhoneNumber = "+85510202974";
    public Double getBalance(){
        return Balance;
    }
    public void setBalance(Double NewBalance){
        this.Balance = NewBalance;
    }
    public static void main (String[] args) {
        int op;
        double W_balance, r_balance, d_balance;
        Scanner input = new Scanner(System.in);
        BankAccount ba = new BankAccount();
        do{
            System.out.println();
            System.out.println("1. Deposit Funds");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. View Account Details");
            System.out.println("4. Exit");
            System.out.print("Please enter the number of operation: ");
            op = input.nextInt();
            switch (op){
                case 1:
                    System.out.print("Input the amount to Deposit: ");
                    d_balance = input.nextDouble();
                    ba.setBalance(ba.getBalance() + d_balance);
                    System.out.println("Your Balance is: "+ ba.getBalance()+"$");
                    break;
                case 2:
                    System.out.print("Input the amount to Withdraw: ");
                    W_balance = input.nextDouble();
                    if(W_balance>ba.getBalance()){
                        System.out.println("Insufficient amount to withdraw");
                    }else{
                        r_balance = ba.getBalance()-W_balance;
                        System.out.println("You had withdraw: "+W_balance+ "$, You still remain: "+r_balance+"$");
                        ba.setBalance(r_balance);
                    }
                    break;
                case 3:
                    System.out.println("Account Number is: " + ba.AccoutNumber);
                    System.out.println("Full Name is: " + ba.CustomerName);
                    System.out.println("Email is: " + ba.Email);
                    System.out.println("Phone Number is: " + ba.PhoneNumber);
                    System.out.println("Balance is: " + ba.getBalance() + "$");
                    break;
                case 4:
                    System.out.println("Thank for using out bank services.");
                    return;
                default:
                    System.out.println("Invalid Input number, Try again!!!");
            }
        }while(op!=4);
        input.close();
    }
}