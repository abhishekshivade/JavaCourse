package infosys;

abstract public class Ship {
    private static Integer counter = 1000;
    private String bookingId;
    private Double billAmount;
    private Passenger passenger;

    public Ship(Passenger passenger){
        this.passenger = passenger;
        this.bookingId = null;
        this.billAmount = 0.0;
    }

    public String getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Double getBillAmount() {
        return this.billAmount;
    }

    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

//    public void setPassenger(Passenger passenger) {
//        this.passenger = passenger;
//    }

    void generateBookingId(){
        if (passenger.getPackageType().equals("Srilanka")) {
            counter++;
            bookingId = "S" + counter;
        }
        else if (passenger.getPackageType().equals("Chennai")) {
            counter++;
            bookingId = "C" + counter;
        }
        else if (passenger.getPackageType().equals("Goa")) {
            counter++;
            bookingId = "G" + counter;
        }
    }

    static Integer identifyDiscountPercentage(Double cost){
        Integer disscountPercentage = 0;
        if (cost>80000.0)
            disscountPercentage = 15;
        else if (50000.0<= cost || cost <= 80000)
            disscountPercentage = 10;
        else
            disscountPercentage = 0;

        return disscountPercentage;
    }

    abstract void calculateBill(String cuisine);

}
