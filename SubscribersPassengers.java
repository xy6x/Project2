public class SubscribersPassengers extends Passenger{



    public SubscribersPassengers() {
    }

    public SubscribersPassengers(String name, int ID) {
        super(name, ID);
    }


    @Override
    public void reserves(Car car) {
 double az= car.price();
        System.out.println(az-(az*0.5));
        setTrip_cost(az-(az*0.5));
    }

    @Override
    public String toString() {
        return "SubscribersPassengers{" + super.toString()+
                '}';
    }
}
