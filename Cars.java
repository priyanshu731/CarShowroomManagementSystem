import java.util.Scanner;

public class Cars extends Showroom implements utility{
    String car_name, car_color,car_fuel_type, car_type,car_transmission;
    Double car_price;

    @Override
    public void get_details(){

    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR NAME : ");
        car_name = sc.nextLine();
        System.out.print(("CAR COLOR : "));
        car_color = sc.nextLine();
        System.out.println("CAR FUEL TYPE(PETROL/DIESEL) :");
        car_fuel_type = sc.nextLine();
        System.out.println("CAR PRICE : ");
        car_price = sc.nextDouble();
        sc.nextLine();
        System.out.println("CAR TYPE(SEDAN/SUV/HATCHBACK) : ");
        car_type = sc.nextLine();
        System.out.println("TRANSMISSION TYPE(AUTOMETIC/MANUAL) : ");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;

    }

}
