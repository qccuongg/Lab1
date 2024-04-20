/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1.q2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question4 {
    Scanner sc = new Scanner(System.in);
    
    private int n;
    
    public Question4(){}

    public Question4(int n) {
        this.n = n;
    }
    
    public int SumEven() {
        int sum = 0;
        int[] Arr = new int[n];
        for (int i = 0; i < Arr.length; i++){
            Arr[i] = sc.nextInt();
        }
        for (int i = 0; i < Arr.length; i++){
            if (Arr[i] % 2 != 0){
               sum += Arr[i];
            }
        }
        return sum;
    }
}
