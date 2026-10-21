/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 * Author: Thivashini A/P Narendran
 * Program Name: StudentInformationSystem.java
 * Date: 21 October 2026
 * Modified Date: None
 * Version: 1.0
 */
public class StudentInformationSystem {

    public static void main(String[] args) {
        

        // i. Display student name and student ID
        String studentName = "Thivashini A/P Narendran";
        String studentID = "S87289";

        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);

        // ii. Store two marks using variables
        int mark1 = 85;
        int mark2 = 90;

        // iii. Calculate the total mark
        int total = mark1 + mark2;

        // iv. Display the total
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);

        // v. Display a message based on the total
        if (total >= 160) {
            System.out.println("Excellent!");
        } else if (total >= 100) {
            System.out.println("Good!");
        } else {
            System.out.println("Needs Improvement!");
        }
    }
}
