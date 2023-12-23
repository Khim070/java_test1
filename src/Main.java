import day20_12_23.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op=0;
        rental_car rc = new rental_car();
        rental_motor rm = new rental_motor();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\n\nWelcome to Java Rental by"+rc.getManufacturer()+" Group");
            System.out.println("1. Rent "+ rc.getModel()+" "+ rc.getYear());
            System.out.println("2. Rent "+ rm.getMotor_model()+" "+ rm.getMotor_year());
            System.out.println("3. Exit");
            System.out.print("Input the number of operation: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    rc.Input_value();
                    rc.Output_value();
                    break;
                case 2:
                    rm.Motor_input();
                    rm.Motor_output();
                    break;
                case 3:
                    break;
            }
        }while(op!=3);
        sc.close();

    }
}