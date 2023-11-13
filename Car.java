public class Car  {
    private int code;
    private Route fixedRoute;
    private int maxOfPassengers;

    public Car() {
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    public int getCode() {
        return code;
    }
public  double price(){
return fixedRoute.getTripPrice();
    }
    public void setCode(int code) {
        this.code = code;
    }




    public int getMaxOfPassengers() {
        return maxOfPassengers;
    }

    public void setMaxOfPassengers(int maxOfPassengers) {
        this.maxOfPassengers = maxOfPassengers;
    }

    public Car(int code, Route fixedRoute, int maxOfPassengers) {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maxOfPassengers = maxOfPassengers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "code=" + code +
                ", maxOfPassengers=" + maxOfPassengers +
                ", fixedRoute=" + fixedRoute +

                '}';
    }
}
