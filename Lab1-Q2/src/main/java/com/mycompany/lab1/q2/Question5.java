/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1.q2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question5 {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ArrList;
    
    public ArrayList<Integer> getList() {
        return ArrList;
    }
       
    public Question5(){
        this.ArrList = new ArrayList<>();
    }
    
    public Question5(ArrayList<Integer> ArrList){
        this.ArrList = ArrList;
    }
    
    public void CreateList () {
        System.out.print("Enter the length of the list: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the list: ");
        for (int i = 0; i < n; i++)
            ArrList.add(sc.nextInt());
    }
    
    public void RemoveFirst () {
        System.out.print("Enter the number you want to delete: ");
        int a = sc.nextInt();
        for (int i = 0; i < ArrList.size(); i++) {
            if (ArrList.get(i) == a){
                ArrList.remove(i);
                break;
            }
        }
    }
    
    public void ReplaceElement (int pos, int num) {
        ArrList.remove(ArrList.size() - 1);
        ArrList.set(pos, num);
    }
    
    public void DuplicateFinder() {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (Integer number : ArrList) {
            if (!seen.add(number)) {
                duplicate.add(number);
            }
        }
        System.out.println("[" + duplicate + "]");
    }
    
    public void DuplicateDelete() {
        HashSet<Integer> seen = new HashSet<>();
        ArrList.removeIf(i -> !seen.add(i));
        System.out.println(ArrList);
    }
}
