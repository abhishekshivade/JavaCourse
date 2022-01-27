package infosys;

public class Passenger {
    String passengerName;
    Integer age;
    private String packageType;
    private Integer noOfPassenger;

    Passenger(String passengerName, Integer age, String packageType, Integer noOfPassenger){
        super();
        this.passengerName = passengerName;
        this.age = age;
        this.packageType = packageType;
        this.noOfPassenger = noOfPassenger;
    }

    public String getPackageType() {
        return packageType;
    }

    public Integer getNoOfPassenger() {
        return noOfPassenger;
    }

    public Boolean validatePassengersDetails(){
        System.out.println(passengerName.length());
        if (passengerName.length()>3 && age>18) {
            return true;
        }
        else
            return false;
    }

//    public String toString(){
//        String str = null;
//        return str;
//    }

}
