package controlstatement;
import java.util.Scanner;
public class ExcersiceSwapNo {
    public static void main(String[] args) {
        int x = 0,y = 0,z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        x = sc.nextInt();
        System.out.println("Enter Y");
        y = sc.nextInt();

        if (x!=y) {
            z = x;
            x = y;
            y = z;
            z = 0;
        }
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        sc.close();
    }

}
// prime no

//min and max no in array
//
//****
//***
//**    1
//*
//
//****
// ***  2
//  **
//   *
//
//  *
// *** 7
//*****
//
//***** 3
// ***
//  *
//
//   *
//  *** 4
// *****
//  ***
//   *
//
//*
//**
//***
//****
//***** // me
//****
//***
//**
//*
//
//     *
//    **
//   ***
//  ****    5
// *****
//  ****
//   ***
//    **
//     *

//    *
//   * *
//  * * *   6
// * * * *
