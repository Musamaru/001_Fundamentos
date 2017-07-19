/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fundamentos;

public class Fundamentos {
    // tipos de datos primitivos
    int numero = 1234567;
    char caracter;
    long largo;
    boolean esVerdadero;
    double decimal;
    float flotante;
    short corto;
    byte bite;
    
    static float decimales = 1.55555555f;
    
    long iban = 1234_3455_1323_3445;
    
    // El tipo String: cadena de caracteres
    static String cadena = "Nombre";
    
    public static void main(String[] args){
        System.out.println(cadena);
        System.out.println(decimales);
        
        
        //Definición de una constante
        final String name = "Fran García";
    }
}