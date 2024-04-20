/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1.q2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Student
 */
public class Question6 {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    public Question6(){}
    
    public Question6(String str){
        this.str = str;
    }
    
    public void StrLength(){
        System.out.println(str.length());
    }
    
    public void WordCount(){
        int wordnum = 1;
        for (char c : str.toCharArray()) {
            if (c != ' '){
                wordnum++;
            }
        }
        System.out.println(wordnum);
    }
    
    public void Concatenate(String a){
        System.out.println(str.concat(a));
    }
    
    public void Palindrome(){
        ArrayList<Character> CharList = new ArrayList<Character>();
        for (char c : str.toCharArray()) {
            CharList.add(c);
        }
        ArrayList<Character> DuplicatedList = new ArrayList<Character>(CharList);
        Collections.reverse(CharList);
        if (CharList.equals(DuplicatedList)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
