/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calendar rightNow = Calendar.getInstance();
        int hora_actual = rightNow.get(Calendar.HOUR_OF_DAY);
        String nome = "";
        
        System.out.println("Qual é o seu nome?");
        nome = ler.nextLine();
        
        if(hora_actual >= 7 && hora_actual < 12){
            System.out.println("Bom dia "+nome);
        }else if(hora_actual >= 12 && hora_actual < 20){
            System.out.println("Bom tarde "+nome);
        }else if(hora_actual < 7 || hora_actual >= 20){
            System.out.println("Boa noite "+nome);
        }else{
            System.out.println("Error!!");
        }
    }

}
