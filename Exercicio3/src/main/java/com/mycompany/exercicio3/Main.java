/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Qual é o valor maximo?");
        numero = ler.nextInt();
        printAllNumber(numero);
    }
    
    public static void printAllNumber(int max){
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }
}
