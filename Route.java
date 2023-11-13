public class Route  {
   private String SP;
   private String DA;
   private double tripPrice;

    public Route(String SP, String DA, double tripPrice) {
        this.SP = SP;
        this.DA = DA;
        this.tripPrice = tripPrice;
    }

    public String getSP() {
        return SP;
    }

    public void setSP(String SP) {
        this.SP = SP;
    }

    public String getDA() {
        return DA;
    }

    public void setDA(String DA) {
        this.DA = DA;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public Route() {
    }

    @Override
    public String toString() {
        return "Route{" +
                "SP='" + SP + '\'' +
                ", DA='" + DA + '\'' +
                ", tripPrice=" + tripPrice +
                '}';
    }
}
