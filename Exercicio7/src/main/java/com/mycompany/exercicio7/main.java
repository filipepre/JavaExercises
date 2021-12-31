/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio7;

/**
 *
 * @author Pc
 */
public class main {
    public static void main(String[] args) {
        char[][] matriz = insertChar('a', 1, 1);
        System.out.println("Letra: "+matriz[1][1]);
    }
    
    public static char[][] insertChar(char letra, int nlinha, int ncoluna){
        char[][] matriz = new char[5][5];
        matriz[nlinha][ncoluna] = letra;
        return matriz;
    }
    
}
