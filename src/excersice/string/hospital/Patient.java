package excersice.string.hospital;

import java.util.Scanner;

public class Patient extends Person{
    String patientId,firstName, middleName, lastName;

    Patient(){}

//    Patient(String firstName, String middleName, String lastName, String patientId){
//        super();
//        this.patientId = patientId;
//    }

    @Override
    void setDetails() throws Exception {
        super.setDetails();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Patient Id");
        patientId = sc.nextLine();
        validate();
        display();
    }

    @Override
    void validate() throws Exception {
        super.validate();

        if (!patientId.isBlank()){
            patientId = patientId.trim();

            if (!patientId.startsWith("P-")){
                throw new Exception("Invalid Patient Id");
            }
        } else{
            throw new Exception("Invalid Patient Id");
        }

        String[] arrStr = fullName.split(" ",3);
         firstName= arrStr[0];
        middleName = arrStr[1];
        lastName = arrStr[2];
    }

    void display(){
        System.out.println("Patient Name : "+firstName+" "+middleName+" "+lastName);
        System.out.println("Mobile No   : "+Long.parseLong(mobileNo));
        System.out.println("Email Id    : "+emailId);
        System.out.println("Patient Id  : "+patientId);
        System.out.println("Saved Successfully...!");
    }
}
