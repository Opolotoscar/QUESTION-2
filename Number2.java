/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number2;

/**
 *
 * @author NYARUP
 */
    import java.util.Scanner;
public class Number2 {

    public static void main(String[] args) {
        // Declare variables for course details
        String courseID;
        String courseName = "";
        int tuition = 0;

        // Prompt the user to enter the CourseID
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the CourseID: ");
        courseID = scanner.nextLine().toUpperCase();

        // Determine the course details based on the CourseID entered
        switch (courseID) {
            case "BSE":
                courseName = "Software Engineering";
                tuition = 900000;
                break;
            case "BIT":
                courseName = "Information Technology";
                tuition = 750000;
                break;
            case "BCS":
                courseName = "Computer Science";
                tuition = 800000;
                break;
            case "BCE":
                courseName = "Computer Engineering";
                tuition = 950000;
                break;
            default:
                System.out.println("Wrong CourseID details");
                break;
        }

        // Display the course details
        if (!courseName.equals("")) {
            System.out.println("Course Name: " + courseName);
            System.out.println("Tuition: " + tuition);
        }

        scanner.close();
    }
}

