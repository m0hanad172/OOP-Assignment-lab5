/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teacher;

public enum Branch {
    MATH("Information regarding math"),
    PHYSICS("Information regarding physics"),
    CS("Information regarding CS"),
    ENG("Information regarding engineering");

    private String description;

    Branch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
