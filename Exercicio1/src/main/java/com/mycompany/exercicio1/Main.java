/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Main {
    
    private static int massa = 0;
    private static double altura = 0;
    private static double imc = 0;
    
    private static int inferior = 18;
    private static int superior = 25;
    
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        
        System.out.println("Calcular o indice de massa corporal:");
        System.out.println("Qual é a massa?");
        massa = ler.nextInt();
        System.out.println("Qual é a altura?");
        altura = ler.nextDouble();
        ler.close();
        imc = massa / (altura*altura);
        if(imc > inferior){
            System.out.println("Peso a menos.");
        }else if(imc < superior){
            System.out.println("Excesso de peso.");
        }else{
            System.out.println("Peso ideal.");
        }
    }
    
}
