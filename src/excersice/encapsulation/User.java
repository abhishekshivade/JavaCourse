package excersice.encapsulation;

public class User {
    private int userId;
    private String userName;
    private String password;
    private String address;
    private int age;
    private int yob;
    private int mob;
    private int dob;
   /* public int dob(){
        private int date;
        private int month;
        private int year;


    }*/

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public int getYob() {
        return yob;
    }

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }
}
