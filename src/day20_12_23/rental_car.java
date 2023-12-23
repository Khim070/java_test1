package day20_12_23;

import java.util.Scanner;

public class rental_car {
    Scanner input = new Scanner(System.in);
    private String manufacturer = "Bayerische Motoren Werke AG";
    private String model = "BMW M2 Coupé";
    private Integer year = 2023, Rentalday=0;
    private Double Rentalprice = 50.0, Rentalcost = 0.0;

    public Integer getRentalday(){
        return Rentalday;
    }
    public String getManufacturer(){return manufacturer;}
    public String getModel(){return model;}
    public Integer getYear(){return year;}

    public Double getRentalcost(){
        return Rentalcost;
    }

    public void setRentalday(int rentalday){
        this.Rentalday = rentalday;
    }

    public void setRentalcost(double rentalcost){
        this.Rentalcost = rentalcost;
    }
    public void Input_value(){
        System.out.println("If you rent more than 30 days, you will get discount for 20%");
        System.out.print("Input your Rental Day: ");
        Rentalday = input.nextInt();
    }

    public void Output_value(){
        if(Rentalday>=30){
            Rentalcost = (Rentalprice * Rentalday) - ((Rentalprice * Rentalday) * 0.20) ;
        }else{
            Rentalcost = Rentalprice * Rentalday;
        }
        System.out.println("You have rented "+model+" Year "+year+" for "+getRentalday()+" days cost: "+Rentalcost+"$");
    }
}
