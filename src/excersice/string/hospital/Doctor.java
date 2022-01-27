package excersice.string.hospital;

import java.util.Scanner;

public class Doctor extends Person {
    String firstName, middleName, lastName, doctorId;

    Doctor(){
//        super();
    }

//    Doctor(String firstName, String middleName, String lastName, String doctorId){
//        super();
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//        this.doctorId = doctorId;
//    }

    @Override
    void setDetails() throws Exception {
        super.setDetails();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Doctor Id");
        doctorId = sc.nextLine();
        validate();
        display();
    }

    @Override
    void validate() throws Exception {
        super.validate();

        if (!doctorId.isBlank()){
            doctorId = doctorId.trim();

            if (!doctorId.startsWith("D-")){
                throw new Exception("Invalid Doctor Id");
            }
        } else{
            throw new Exception("Invalid Doctor Id");
        }

        String[] arrStr = fullName.split(" ",3);
        firstName = arrStr[0];
        middleName = arrStr[1];
        lastName = arrStr[2];
    }

    void display(){
        System.out.println("Doctor Name : "+firstName+" "+middleName+" "+lastName);
        System.out.println("Mobile No   : "+Long.parseLong(mobileNo));
        System.out.println("Email Id    : "+emailId);
        System.out.println("Doctor Id   : "+doctorId);
        System.out.println("Saved Successfully...!");
    }


}
