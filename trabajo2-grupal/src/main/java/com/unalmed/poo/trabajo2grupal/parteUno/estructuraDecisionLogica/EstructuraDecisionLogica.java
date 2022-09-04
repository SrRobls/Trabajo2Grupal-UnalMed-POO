package com.unalmed.poo.trabajo2grupal.parteUno.estructuraDecisionLogica;


import java.util.ArrayList;
import java.util.Scanner;

public class EstructuraDecisionLogica{

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Nota: Para cada uno de los ejercicios, ejecutar una por una, es decir, tener solo una des-comentada a la vez.

        System.out.println("|--Ejercicio Resuelto #7--|");
        EjercicioResueltoN7();
        // System.out.println("|--Ejercicio Resuelto #10--|");
        // EjercicioResueltoN10();
        // System.out.println("|--Ejercicio Resuelto #11--|");
        // EjercicioResueltoN11();
        // System.out.println("|--Ejercicio Resuelto #12--|");
        // EjercicioResueltoN12();
        // System.out.println("|--Ejercicio Resuelto #13--|");
        // EjercicioResueltoN13();
        // System.out.println("|--Ejercicio Resuelto #14--|");
        // EjercicioResueltoN14();
        // System.out.println("|--Ejercicio Resuelto #15--|");
        // EjercicioResueltoN15();
        // System.out.println("|--Ejercicio Propuesto #22--|");
        // EjercicioPropueestoN22();
        // System.out.println("|--Ejercicio Propuesto #23--|");
        // EjercicioPropueestoN23();
        // System.out.println("|--Ejercicio Propuesto #24--|");
        // EjercicioPropueestoN24();
    }

    public static void EjercicioResueltoN7() {
        // Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo 
        // si A es mayor, menor o igual a B.
        System.out.print("Dame el valor de un numero: ");
        Integer A = input.nextInt();
        System.out.print("Dame el valor de otro numero: ");
        Integer B = input.nextInt();
        if (A > B){
            System.out.printf("El numero A: %d es mayor que el numero B: %d.", A, B);
        }else{
            if(B>A){
                System.out.printf("El numero B: %d es mayor que el numero A: %d.", B, A);
            }else{
                System.out.println("Los numeros son iguales.");
            }
        }
        System.out.println();
    }

    public static void EjercicioResueltoN10() {
        // Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los 
        // siguientes datos: 
        // • Número de inscripción 
        // • Nombres 
        // • Patrimonio. 
        // • Estrato social. 
        // La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio 
        // es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3% 
        // sobre el patrimonio. Hacer un algoritmo que muestre: 
        // • Número de inscripción. 
        // • Nombres. 
        // • Pago de matrícula
        Double pago = 50000.0;
        System.out.print("Numero de Inscripcion: ");
        String numeroIncripcion = input.nextLine();
        System.out.print("Nombre: ");
        String nombreEstudiante = input.nextLine();
        System.out.print("Valor Patrimonio: ");
        Double valorPatrimonio = input.nextDouble();
        System.out.print("Estrato: ");
        Integer estrato = input.nextInt();

        if (valorPatrimonio > 2000000 && estrato > 3){
            pago += valorPatrimonio * 0.03;
        }

        System.out.printf("El estudiante con numero de inscripcion %s, nombre: %s debe pagar $%.3f.", 
        numeroIncripcion, nombreEstudiante, pago);
        System.out.println();
        
    }

    public static void EjercicioResueltoN11() {
        // Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de  
        // ellos

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++){
            while (true){
                System.out.print("Numero: ");
                Integer numero = input.nextInt();
                if (!numeros.contains(numero)){
                    numeros.add(numero);
                    break;
                }
                System.out.println("Ese numero ya ha sido introducido anteriormente. Escoge otro");
            }
        }

        Integer mayor = numeros.get(0);
        if (numeros.get(1) > mayor){
            mayor = numeros.get(1);
        }
        if (numeros.get(2) > mayor){
            mayor = numeros.get(2);
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println();
    }

    public static void EjercicioResueltoN12() {
        // Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas 
        // semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden 
        // de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando 
        // no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo 
        // que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes 
        // datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora 
        // normal de trabajo.
        System.out.print("Nombre del Trabajador: ");
        String nombreTrabajador = input.nextLine();
        System.out.print("Horas Trabajadas: ");
        Integer horasTrabajadas = input.nextInt();
        System.out.print("Valor Hora: ");
        Double valorHora = input.nextDouble();
        Double pagoTrabajador = 0.0;
        if (horasTrabajadas > 40){
            pagoTrabajador = 40*valorHora;
            Integer horasExtrasDobles = (horasTrabajadas - 40);
            Integer horasExtrasTriples = 0;
            if (horasExtrasDobles > 8){
                horasExtrasTriples = horasExtrasDobles - 8;
                horasExtrasDobles = 8;
            }
            
            // doble para las primeras 8 horas extras
            pagoTrabajador += horasExtrasDobles*(valorHora*2);

            //triple para el restante de horas extras
            pagoTrabajador += horasExtrasTriples*(valorHora*3);
        }else{
            pagoTrabajador = horasTrabajadas*valorHora;
        }

        System.out.printf("El trabajador %s: $%.2f", nombreTrabajador, pagoTrabajador);
        System.out.println();
    }

    public static void EjercicioResueltoN13() {
        // Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la 
        // compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita 
        // es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es 
        // amarilla un 25%, si es azul un 
        // 50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un 
        // cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores 
        // mencionados.
        



        System.out.print("Valor de la Compra: ");
        Double valorCompra = input.nextDouble();
        System.out.print("Color Bolita (En Mayusculas): ");
        String colorBolita = input.next();
        Integer porDescuento;

        switch (colorBolita){
            case "BLANCO":
                porDescuento = 0;
                break;
            case "VERDE":
                porDescuento = 10;
                break;
            case "AMARILLO":
                porDescuento = 25;
                break;
            case "AZUL":
                porDescuento = 50;
                break;
            default:
                porDescuento = 100;
        }

        Double valorPagar = valorCompra - (valorCompra*porDescuento)/100;

        System.out.printf("Valor Compra: %.2f.  Color Bolita: %s.   Pordentaje De Descuento: %d.    Valor A Pagar: %.2f",
        valorCompra, colorBolita, porDescuento, valorPagar);
        System.out.println();

    }

    public static void EjercicioResueltoN14() {
        // Una empresa con tres departamentos tiene establecido un plan de incentivos para sus 
        // vendedores. Al final del período, a cada departamento se le pide el importe global de las 
        // ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al 
        // salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las 
        // nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos: 
        // • Ventas del departamento 1 
        // • Ventas del departamento 2 
        // • Ventas del departamento 3 
        // • Salario de los vendedores de cada departamento 
        // Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento 
        // al finalizar el período. 


        System.out.print("Ventas Departamento 1: ");
        Double vDepa1 = input.nextDouble();
        System.out.print("Ventas Departamento 2: ");
        Double vDepa2 = input.nextDouble();
        System.out.print("Ventas Departamento 3: ");
        Double vDepa3 = input.nextDouble();
        System.out.print("Salario Vendedores: ");
        Double salarioVendedores = input.nextDouble();


        Double salarioI = salarioVendedores;
        Double salarioII = salarioVendedores;
        Double salarioIII = salarioVendedores; 
        Double totalVentas = vDepa1+vDepa2+vDepa3;
        Double valor33porcentajeVentas = (totalVentas) * 0.33;
        if (vDepa1 > valor33porcentajeVentas){
            salarioI += salarioVendedores*0.2;
        }
        if (vDepa2 > valor33porcentajeVentas){
            salarioII += salarioVendedores*0.2;
        }
        if (vDepa3 > valor33porcentajeVentas){
            salarioIII += salarioVendedores*0.2;
        }

        System.out.printf("vDepa1: %.2f.    vDepa2: %.2f.    vDepa3: %.2f.    Valor Total Ventas: %.2f.    Equivalente 33 Porciento: %.2f.\n Salario 1: %.2f.  Salario 2: %.2f.    Salario 3: %.2f.",
        vDepa1, vDepa2, vDepa3, totalVentas, valor33porcentajeVentas, salarioI, salarioII, salarioIII);
        System.out.println();

        // Nota: La prueba de escritorio del libro, esta mal, note que los datos no corresponden.
    }

    public static void EjercicioResueltoN15() {
        // Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una 
        // diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor 
        // o menor peso.

        System.out.print("Peso de A: ");
        double pesoA = input.nextDouble();
        System.out.print("Peso de B: ");
        double pesoB = input.nextDouble();
        System.out.print("Peso de C: ");
        double pesoC = input.nextDouble();
        System.out.print("Peso de D: ");
        double pesoD = input.nextDouble();



        if (pesoA != pesoB && pesoA != pesoC && pesoA != pesoD){
            System.out.println("La bola A es la diferente");
            if (pesoA > pesoB){
                System.out.println("Es mayor que los demas");
            }else{
                System.out.println("Es menor que los demas");
            }
        }

        if (pesoB != pesoA && pesoB != pesoC && pesoB != pesoD){
            System.out.println("La bola B es la diferente");
            if (pesoB > pesoA){
                System.out.println("Es mayor que los demas");
            }else{
                System.out.println("Es menor que los demas");
            }
        }

        if (pesoC != pesoB && pesoC != pesoA && pesoC != pesoD){
            System.out.println("La bola C es la diferente");
            if (pesoC > pesoB){
                System.out.println("Es mayor que los demas");
            }else{
                System.out.println("Es menor que los demas");
            }
        }

        if (pesoD != pesoB && pesoD != pesoC && pesoD != pesoA){
            System.out.println("La bola D es la diferente");
            if (pesoD > pesoB){
                System.out.println("Es mayor que los demas");
            }else{
                System.out.println("Es menor que los demas");
            }
        }
        System.out.println();
    }

    public static void EjercicioPropueestoN22() {
        // Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el 
        // número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor 
        // de $450.000, de lo contrario escriba sólo el nombre

        System.out.print("Nombre Empleado: ");
        String nombreEmpleado = input.nextLine();
        System.out.print("Pago Por Hora: ");
        Double salarioEmpleadoHora = input.nextDouble();
        System.out.print("Horas Trabjadas Al Mes: ");
        Double horasTrabajadasAlMes = input.nextDouble();



        if (salarioEmpleadoHora * horasTrabajadasAlMes > 450000){
            System.out.printf("El empleado %s tiene un salario mensual de $%.2f", nombreEmpleado, salarioEmpleadoHora * horasTrabajadasAlMes);
        }else{
            System.out.printf("El empleado %s recibe un salario mensual inferior  $450.000", nombreEmpleado);
        }
        System.out.println();
    }

    public static void EjercicioPropueestoN23() {
        // Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado, 
        // elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación. 


        System.out.print("Dame el valor de A (No puede ser 0): ");
        Double valorA = input.nextDouble();
        System.out.print("Dame el valor de B: ");
        Double valorB = input.nextDouble();
        System.out.print("Dame el valor de C: ");
        Double valorC = input.nextDouble();


        // Comprobamos si lo de la raiz es mayor o igua cero, si es asi, procedemos con el calculo
        Double comprobar = Math.pow(valorB, 2) -4*valorA*valorC;

        if (comprobar >= 0){
            // Para esto aplicamos la formula del estudiante XD
            System.out.println("Las Posibles Soluciones De La Ecuacion Son");
            Double x1 = (-valorB + Math.sqrt(Math.pow(valorB, 2) - 4*valorA*valorC)) / (2*valorA);
            Double x2 = (-valorB - Math.sqrt(Math.pow(valorB, 2) - 4*valorA*valorC)) / (2*valorA);
            System.out.printf("X1 = %f, X2 = %f", x1, x2);
        }else{
            System.out.println("No se puede hacer el calculo.");
        }
        System.out.println();
        

        // Dame el valor de A: 1
        // Dame el valor de B: 2
        // Dame el valor de C: -8
        // Las Posibles Soluciones De La Ecuacion Son
        // X1 = 2,000000, X2 = -4,000000


    }

    public static void EjercicioPropueestoN24() {
        //  Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es 
        // la esfera de mayor peso


        System.out.print("Dame el peso de A: ");
        Double pesoA = input.nextDouble();
        System.out.print("Dame el peso de B: ");
        Double pesoB = input.nextDouble();
        System.out.print("Dame el peso de C: ");
        Double pesoC = input.nextDouble();


        String bolaMayor = "A";
        Double pesoMayor = pesoA;

        if (pesoB > pesoMayor){
            pesoMayor = pesoB;
            bolaMayor = "B";
        }

        if (pesoC > pesoMayor){
            pesoMayor = pesoC;
            bolaMayor = "C";
        } 

        System.out.printf("La bola de mayor peso es la %s con un peso de %.2f", bolaMayor, pesoMayor);
        input.close();
        System.out.println();
    }

    
}