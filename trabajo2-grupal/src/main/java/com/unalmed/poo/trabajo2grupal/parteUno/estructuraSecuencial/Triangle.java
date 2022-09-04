package com.unalmed.poo.trabajo2grupal.parteUno.estructuraSecuencial;

// Ejercicio propuesto #19


import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese el valor de unico lado conocido del triangulo: ");
        
        double lado1=sc.nextDouble(); 
        
        double perimetro=Calculo_Perimetro(lado1);
        double altura=Calculo_Altura(lado1);
        double area=Calculo_Area(lado1,altura);
        
        System.out.println("El perimetro del triangulo es: "+perimetro);
        System.out.println("La altura del triangulo es: "+altura);
        System.out.println("La area del triangulo es: "+area);
        sc.close();
    }
    
    static double Calculo_Perimetro(double lado){
        double perimetro=lado*3;
        return perimetro;
    }
    
    static double Calculo_Altura(double lado){
        double altura=(lado*Math.sqrt(3))/2;
        
        return altura;
    }
    
    static double Calculo_Area(double lado, double altura){
        double area=(lado*altura)/2;
        
        return area;
    }
}