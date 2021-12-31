/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio6;

/**
 *
 * @author Pc
 */
public class main {
    
    public static void main(String[] args) {
        int[] vec = new int[5];
        vec[0]=1;
        vec[1]=2;
        vec[2]=3;
        vec[3]=4;
        vec[4]=5;
        showVector(vec);
    }
    
    public static void showVector(int[] vec){
        for (int i = 0; i < 5; i++) {
            System.out.println(i+": "+vec[i]);
        }
    }
    
}
