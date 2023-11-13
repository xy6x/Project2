public class Main {
    public static void main(String[] args) {
        Route r1 = new Route("hail", "riyadh", 550.50);
        Car c1 = new Car(255, r1, 2);

        Route r2 = new Route("riyadh", "Hail", 800);
        Car c2 = new Car(255, r2, 0);

        SubscribersPassengers s = new SubscribersPassengers("Yousef", 1154);
        s.reserves(c2);
        System.out.println(s.toString());

        Non_SubscribersPassengers non1 = new Non_SubscribersPassengers("bander", 1451);
        System.out.println(c1.toString());
        non1.reserves(c1);
        System.out.println(non1.toString());
        s.getReserved();

    }
}