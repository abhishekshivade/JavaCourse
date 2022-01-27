package infosys;

public class CruiseShip extends Ship{
    private static String[] availablePackagesArr = {"Srilanka","Chennai","Goa"};
    private static Integer[] priceArr = {65000,25000,30000};
    private Boolean adventureActivity;

    public CruiseShip(Passenger passenger, Boolean adventureActivity) {
        super(passenger);
        this.adventureActivity = adventureActivity;
    }

    @Override
    public void calculateBill(String cuisine) {
        Integer price = 0, totalCost = 0, discount = 0;
        Double finalCost = 0.0;
        if (getPassenger().validatePassengersDetails() != true){
            setBookingId("NA");
            setBillAmount(-1.0);
        }else {
            for (Integer i = 0; i < availablePackagesArr.length; i++) {
                if (getPassenger().getPackageType().equalsIgnoreCase(availablePackagesArr[i])) {
                    price = priceArr[i];
                }
                else
                    price = -1;
            }
        }

        if (price == -1){
            setBookingId("NA");
            setBillAmount(-1.0);
        }else {
            if (1 <= getPassenger().getNoOfPassenger() && getPassenger().getNoOfPassenger() <= 10){
                totalCost = getPassenger().getNoOfPassenger() * price;
                discount = Ship.identifyDiscountPercentage(Double.valueOf(totalCost));
                finalCost = Double.valueOf(totalCost * discount/100);
            }

            if (cuisine.equals("italian")) {
                finalCost += 100;
            }

            if (cuisine.equalsIgnoreCase("chinese")) {
                finalCost += 130;
            }

            if (adventureActivity == true) {
                finalCost += 1200;
            }

            setBillAmount(finalCost);
            generateBookingId();
        }

    }

//    public String toString(){
//        String str = null;
//        return str;/*CruiseShip("Passenger: "+ this.getPassenger()+",adventureActivity: "+this.adventureActivity);*/
//    }
}
