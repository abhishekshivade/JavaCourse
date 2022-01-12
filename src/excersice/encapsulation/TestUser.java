package excersice.encapsulation;

public class TestUser {
    public static void main(String[] args){
        User user = new User();
        user.setUserId(1);
        user.setUserName("User_1");
        user.setPassword("123456");
        user.setAddress("Pune");
        user.setYob(1997);
        user.setMob(8);
        user.setDob(10);
        System.out.println("User ID = "+user.getUserId());
        System.out.println("User Name = "+user.getUserName());
        System.out.println("User Address = "+user.getAddress());

        int userAge = (2021 - user.getYob());
        int userMonth = (12 - user.getMob());
        int userDate = (30 - user.getDob());

//        System.out.println("User Age = "+userAge/*(2021 - user.getYob())*/);
//        System.out.println("User Age = "+userMonth/*(12 - user.getMob())*/);
//        System.out.println("User Age = "+userDate/*(30 - user.getDob())*/);
        System.out.println("User Age = "+userAge+" Years "+userMonth+" Months "+userDate+" Days");
    }

   /* void display(){
        System.out.println("User ID = "+user.getUserId());
        System.out.println("User Name = "+user.getUserName());
        System.out.println("User Address = "+user.getAddress());
        int userAge = 2021 - user.getAge();
        System.out.println("User Age = "+userAge);
    }*/
}
