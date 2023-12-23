package day20_12_23;

import java.util.Scanner;

public class rental_motor {
    Scanner input = new Scanner(System.in);
    private String motor_manufacturer = "Bayerische Motoren Werke AG";
    private String motor_model = "R 1250 RS";
    private Integer motor_year = 2024, motor_Rentalday=0;
    private Double motor_Rentalprice = 30.0, motor_Rentalcost = 0.0;

    public Integer getMotor_Rentalday(){
        return motor_Rentalday;
    }
    public String getMotor_model(){
        return motor_model;
    }

    public Integer getMotor_year(){
        return motor_year;
    }

    public void setMotor_Rentalday(Integer motor_rentalday){
        this.motor_Rentalday = motor_rentalday;
    }

    public void Motor_input(){
        System.out.println("If you rent more than 30 days, you will get discount for 20%");
        System.out.print("Input your Rental Day: ");
        motor_Rentalday = input.nextInt();
    }

    public void Motor_output() {
        if (motor_Rentalday >= 30) {
            motor_Rentalcost = (motor_Rentalprice * motor_Rentalday) - ((motor_Rentalprice * motor_Rentalday) * 0.20);
        } else {
            motor_Rentalcost = motor_Rentalprice * motor_Rentalday;
        }
        System.out.println("You have rented " + motor_model + " Year " + motor_year + " for " + motor_Rentalday + "days cost: " + motor_Rentalcost + "$");
    }
}
