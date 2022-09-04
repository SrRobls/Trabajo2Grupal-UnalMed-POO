package com.unalmed.poo.trabajo2grupal.parteUno.estructuraSecuencial;

// Ejercicio propuesto #18


public class Worker {

    public static void main(String[] args) {
       Empleado empleado1=new Empleado();
       empleado1.cod_empleado="632-45";
       empleado1.nombres="Mario Kaztro";
       empleado1.horas_trabajadas=36;
       empleado1.valor_hora=4200;
       empleado1.porcentaje_retencion=0.16;
       
       
       double salario_bruto=Calculo_Salario_Bruto(empleado1.horas_trabajadas,empleado1.valor_hora);
       double salario_neto=Calculo_Salario_Neto(salario_bruto,empleado1.porcentaje_retencion);
       
       System.out.println("El codigo del empleado es "+empleado1.cod_empleado);
       System.out.println("Los nombres del empleado son "+empleado1.nombres);
       System.out.println("El empleado "+empleado1.nombres+" tiene un salario bruto de : "+salario_bruto+"$");
       System.out.println("El empleado "+empleado1.nombres+" tiene un salario neto de : "+salario_neto+"$");
    }

static double Calculo_Salario_Bruto(short horas, short valor){
    
    double salario_bruto=horas*valor;
    
    return salario_bruto;
    
}

static double Calculo_Salario_Neto(double salario_bruto, double porcentaje){
    
    double salario_neto=salario_bruto-(salario_bruto*porcentaje);
    
    return salario_neto;
}


}


class Empleado{
    String cod_empleado,nombres;
    short horas_trabajadas, valor_hora;
    double porcentaje_retencion;
}