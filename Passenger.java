public abstract class Passenger   {
    private String name;
    private int ID;
    private Car reserved;
    private double trip_cost;
    public Passenger() {
    }



    public Car getReserved() {
        return reserved;
    }
    public void setReserved(Car reserved) {
        this.reserved = reserved;
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }

    public Passenger(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Passenger(String name, int ID, Car reserved, double trip_cost) {
        this.name = name;
        this.ID = ID;
        this.reserved = reserved;
        this.trip_cost = trip_cost;
    }

    public abstract void reserves(Car car);

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", trip_cost=" + trip_cost +

                ", reserved=" + reserved +

                '}';
    }
}
