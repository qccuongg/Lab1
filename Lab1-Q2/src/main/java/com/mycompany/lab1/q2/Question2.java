/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1.q2;

/**
 *
 * @author Student
 */
public class Question2 {
    
    private int num1;
    private int num2;
    private int num3;
    
    public Question2(){}

    public Question2(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    public int Minimum() {
        int min = num1;
        if (min >= num2) {
            min = num2;
        }
        else {
            if (min >= num3) {
                min = num3;
            }
        }
        return min;
    }
}
