/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teacher;

public class Teacher {
    private int id;
    private Branch branch;

    public Teacher(int id, Branch branch) {
        this.id = id;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public Branch getBranch() {
        return branch;
    }

    public static void main(String[] args) {
        // Creating four teacher objects with different branches
        Teacher teacher1 = new Teacher(1, Branch.MATH);
        Teacher teacher2 = new Teacher(2, Branch.PHYSICS);
        Teacher teacher3 = new Teacher(3, Branch.CS);
        Teacher teacher4 = new Teacher(4, Branch.ENG);

        // Putting them in an array
        Teacher[] teachers = { teacher1, teacher2, teacher3, teacher4 };

        // Printing their branches using a for loop
        for (Teacher teacher : teachers) {
            System.out.println("Teacher ID: " + teacher.getId() +
                    ", Branch: " + teacher.getBranch() +
                    ", Description: " + teacher.getBranch().getDescription());
        }
    }
}