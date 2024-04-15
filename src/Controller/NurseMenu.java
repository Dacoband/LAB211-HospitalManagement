/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Scanner;
import NurseManagement.*;
import java.util.List;

public class NurseMenu {

    public static void main(String[] args) {
        NurseList nurseList = new NurseList();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("=== Nurse Management System ===");
            System.out.println("1. Create a Nurse");
            System.out.println("2. Find a Nurse");
            System.out.println("3. Update a Nurse");
            System.out.println("4. Delete a Nurse");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 0:
                    running = false;
                    break;
                case 1:
                    createNurse(nurseList, scanner);
                    break;
                case 2:
                    findNurse(nurseList, scanner);
                    break;
                case 3:
                    updateNurse(nurseList, scanner);
                    break;
                case 4:
                    deleteNurse(nurseList, scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void createNurse(NurseList nurseList, Scanner scanner) {
        System.out.println("=== Create a Nurse ===");

        System.out.print("Staff ID: ");
        String staffID = scanner.nextLine();
        if (!nurseList.isStaffIDUnique(staffID)) {
            System.out.println("Staff ID already exists. Please enter a unique staff ID.");
            System.out.println();
            return;
        }

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Shift: ");
        String shift = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        Nurse nurse = new Nurse(staffID, name, age, gender, address, phone, department, shift, salary);
        nurseList.addNurse(nurse);
        System.out.println("Nurse created successfully:");
        System.out.println(nurse.toString());
        System.out.println();
    }
    
    private static void findNurse(NurseList nurseList, Scanner scanner) {
        System.out.println("=== Find a Nurse ===");

        System.out.print("Enter nurse's name or part of the name: ");
        String name = scanner.nextLine();

        List<Nurse> foundNurses = nurseList.findNurseByName(name);
        if (foundNurses.isEmpty()) {
            System.out.println("No nurse found.");
        } else {
            System.out.println("Found nurses:");
            for (Nurse nurse : foundNurses) {
                System.out.println(nurse.toString());
            }
        }

        System.out.println();
    }
     private static void updateNurse(NurseList nurseList, Scanner scanner) {
        System.out.println("=== Update a Nurse ===");

        System.out.print("Enter the staff ID: ");
        String staffID = scanner.nextLine();

        Nurse nurseToUpdate = null;
        for (Nurse nurse : nurseList.getAllNurses()) {
            if (nurse.getStaffID().equals(staffID)) {
                nurseToUpdate = nurse;
                break;
            }
        }

        if (nurseToUpdate == null) {
            System.out.println("The nurse does not exist.");
        } else {
            System.out.println("Enter the updated information for the nurse:");

            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Phone: ");
            String phone = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Shift: ");
            String shift = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            Nurse updatedNurse = new Nurse(staffID, name, age, gender, address, phone, department, shift, salary);
            if (nurseList.updateNurse(updatedNurse)) {
                System.out.println("Nurse updated successfully:");
                System.out.println(updatedNurse.toString());
            } else {
                System.out.println("Failed to update nurse. Please try again.");
            }
        }

        System.out.println();
    }

    private static void deleteNurse(NurseList nurseList, Scanner scanner) {
        System.out.println("=== Delete a Nurse ===");

        System.out.print("Enter the staff ID: ");
        String staffID = scanner.nextLine();

        if (nurseList.deleteNurse(staffID)) {
            System.out.println("Nurse deleted successfully.");
        } else {
            System.out.println("The nurse does not exist.");
        }

        System.out.println();
    }

}
