import java.util.Scanner;

public class Non_SubscribersPassengers extends Passenger{
   private boolean discount  ;
    public Non_SubscribersPassengers() {
    }

    public Non_SubscribersPassengers(String name, int ID) {
        super(name, ID);
    }


    @Override
    public void reserves(Car car) {
        Scanner s =new Scanner(System.in);
        System.out.println("please enter Does he have a discount true or no have");
        boolean discount =s.hasNextBoolean();
        double az = car.price();

        if (discount == true) {

            System.out.println(az - (az * 0.1));
            setTrip_cost(az - (az * 0.1));
        }else setTrip_cost(az);
    }

    @Override
    public String toString() {
        return "Non_SubscribersPassengers{" +
                super.toString()+
                '}';
    }
}
