package com.unalmed.poo.trabajo2grupal.parteUno.estructuraSecuencial;

// Ejercicio Propuesto #21


import java.util.Arrays;
import java.util.Scanner;


public class AnotherTriangle {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        double lados[] = new double[3];
        
        while(true){
            System.out.println("A continuacion se le solicitaran 3 lados para construir un triangulo:");
            for (int i = 0; i <= 2; i++) {
                System.out.println("Ingrese el valor del lado #"+(i+1));
                lados[i]=sc.nextDouble();
            }
            
            Arrays.sort(lados);
            if (Verificar_Viabilidad(lados[0],lados[1],lados[2])==false) {
                System.out.println("Con los lados ingresados no se puede construir un triangulo, ingresa valores validos para la construccion de un triangulo\n");
            }
            else{
                break;
            }
            sc.close();
        }
        
        
        
        
        double perimetro=Calculo_Perimetro(lados[0],lados[1],lados[2]);
        double semi_perimetro=Calculo_Semiperimetro(perimetro);
        double area=Calculo_Area(lados[0],lados[1],lados[2],semi_perimetro);
        
        System.out.println("El perimetro del triangulo es: "+perimetro);
        System.out.println("El semiperimetro del triangulo es: "+semi_perimetro);
        System.out.println("La area del triangulo es: "+area);
        
    }
    
     static double Calculo_Perimetro(double lado1,double lado2, double lado3){
        double perimetro=lado1+lado2+lado3;
        return perimetro;
    }
    
    static double Calculo_Semiperimetro(double perimetro){
        double semiperimetro=perimetro/2;
        
        return semiperimetro;
        
    }
    
    static double Calculo_Area(double lado1,double lado2, double lado3, double sp){
        double area=Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3));
        
        return area;
    }
    
    static boolean Verificar_Viabilidad(double lado1, double lado2, double lado3){
        if (lado1+lado2>lado3) {
            return true;
        }
        else{
            return false;
        }
    }
}
