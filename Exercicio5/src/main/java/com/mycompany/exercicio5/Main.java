/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio5;

/**
 *
 * @author Pc
 */
public class Main {
    
    public static void main(String[] args) {
        int[] vecNew = initVec();
        
        for (int i = 0; i < 11; i++) {
            System.out.println(vecNew[i]);
        }
    }
    
    public static int[] initVec(){
        int[] vec = new int[11];
        
        for (int i = 0; i <= 10; i++) {
            vec[i] = i;
        }
        
        return vec;
    }
    
}
