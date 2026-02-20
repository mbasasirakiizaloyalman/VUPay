/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vupay;

/**
 *
 * @author NDIBAREMA
 */
import java.util.Scanner;

public class VUPay {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        String moduleCode;
        String courseName = "";
        int tuition = 0;

        System.out.print("Enter Module Code: ");
        moduleCode = input.nextLine().toUpperCase();

        switch(moduleCode){
            case "BSF" -> {
                courseName = "BSc. Software Engineering";
                tuition = 900000;
            }

            case "BIT" -> {
                courseName = "BSc. Information Technology";
                tuition = 750000;
            }

            case "BCS" -> {
                courseName = "BSc. Computer Science";
                tuition = 800000;
            }

            case "BCE" -> {
                courseName = "BSc. Computer Engineering";
                tuition = 950000;
            }

            default -> {
                System.out.println("Wrong Module Code details");
                System.exit(0);
            }
        }

        System.out.println("Course: " + courseName);
        System.out.println("Tuition: UGX " + tuition);
    }
}
