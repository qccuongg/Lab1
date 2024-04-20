/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1.q2;

/**
 *
 * @author Student
 */
public class Question3 {
    private int n;
    
    public Question3(){}
    
    public Question3(int n) {
        this.n = n;
    }
      
    public int Hailstone() {
        while (n != 1) {
            if (n % 2 == 0) {
                System.out.print(n + " is even, so we take n/2: ");
                n /= 2;
                if (n != 1)
                    System.out.println(n);
            }
            else {
                System.out.print(n + " is odd, so we take 3*n+1: ");
                n = n*3+1;
                System.out.println(n);
            }
        }
        return n;
    }
    
}
