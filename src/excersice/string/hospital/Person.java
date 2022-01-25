package excersice.string.hospital;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

import java.util.Scanner;

public class Person {
    String fullName, mobileNo, emailId;

    Person() {
    }

//    Person(String fullName, String mobileNo, String emailId){
//        this.fullName = fullName;
//        this.mobileNo = mobileNo;
//        this.emailId = emailId;
//    }

    void setDetails() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter FirstName MiddleName LastName");
        fullName = sc.nextLine();

        System.out.println("Enter Mobile Number");
        mobileNo = sc.nextLine();

        System.out.println("Enter Email Id");
        emailId = sc.nextLine();

        sc.close();
    }

    void validate() throws Exception {
        if (!fullName.isBlank()) {
            fullName = fullName.trim();
        } else {
            throw new Exception("Invalid Name");
        }

        if (!mobileNo.isBlank()) {
            mobileNo = mobileNo.trim();

            if (mobileNo.length() != 10) {
//                Integer mobNo = Integer.parseInt(mobileNo);
                throw new Exception("Invalid Mobile Number");
            } /*else{
                throw new Exception("Invalid Mobile Number");
            }*/
        } else {
            throw new Exception("Invalid Mobile Number");
        }
        if (!emailId.isBlank()) {
            emailId = emailId.trim();

            if (emailId.contains("@")) {
                if (!emailId.contains(".com") || !emailId.contains(".in")) {
                    throw new Exception("Invalid Email Id");
                }
            } else {
                throw new Exception("Invalid Email Id");
            }
        } else {
            throw new Exception("Invalid Email Id");
        }
    }
}
