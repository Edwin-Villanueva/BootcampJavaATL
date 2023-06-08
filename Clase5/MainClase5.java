package Clase5;

import java.util.Scanner;
public class MainClase5 {

    public Integer calculadoraPerruna(Integer edadPerro){//investigue para crear funciones

        return edadPerro*7;
    }
    public double conversorMillasAKilometros(double millas){
        return millas * 1.60934;
    }

    public double calculadoraDeDescuento(double precioOri,Integer dcto){
        return precioOri - (precioOri * dcto / 100);
    }
    public double calculadoraDePropinas(double totalCuenta, int porcentajePropina){
        return totalCuenta * (double) (porcentajePropina / 100);

    }

    public static void main(String[] args){
        Scanner lectorDeDatos = new Scanner(System.in);//activo el lector de datos
        /*1) Calculadora de edad de perros:
        Pídele al usuario que ingrese la edad de su perro.
        Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
        */
        MainClase5 objeto = new MainClase5();
        System.out.println("Ingresa la edad de tu perro");
        Integer edadPerruna=lectorDeDatos.nextInt();
        System.out.println("tu perro tiene  : "+objeto.calculadoraPerruna(edadPerruna) + " años humanos");

        System.out.println("*********************************************************************");

        /*2) Conversor de millas a kilómetros:
        Pídele al usuario que ingrese una distancia en millas.
        Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
        Muestra la distancia en kilómetros al usuario.
        */
        System.out.println("ingresa la cantidad de millas de queseas convertir a kilometros");
        double millas =  lectorDeDatos.nextDouble();
        System.out.println("la conversion de millas a kilometros dio : "+objeto.conversorMillasAKilometros(millas)+" kilometros");

        System.out.println("*********************************************************************");


        /*3) Calculadora de descuento:
        Pídele al usuario que ingrese el precio original de un producto.
        Pídele al usuario que ingrese el porcentaje de descuento.
        Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
        Muestra el precio final al usuario.
        */
        System.out.println("Ingresa un precio");
        double precio = lectorDeDatos.nextDouble();
        System.out.println("ingresa un descuento");
        Integer dcto = lectorDeDatos.nextInt();
        System.out.println("El precio final a cobrar es : "+ objeto.calculadoraDeDescuento(precio,dcto));
        System.out.println("*********************************************************************");

        /*4) Calculadora de propinas:
        Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
        */

        System.out.println("Ingresa el total de la cuenta");
        double totalCuenta = lectorDeDatos.nextDouble();
        System.out.println("ingresa un porcentaje de propina");
        int porcentajePropina = lectorDeDatos.nextInt();// voy a asumir que el porcentaje es en entero
        System.out.println("El monto de  propina sugerida es  : "+ objeto.calculadoraDePropinas(totalCuenta,porcentajePropina));
        System.out.println("*********************************************************************");

        int nroGanador = (int) (Math.random() * 101);
        System.out.println("Adivina...... ingresa un numero entero entre 1 a 100 y verifica si ganaste! ");
        int numeroIngresado  = lectorDeDatos.nextInt();
        if (nroGanador == numeroIngresado ){
            System.out.println("Ganaste !");
        }
        else{
            System.out.println("Lo siento no acertaste en esta oportunidad");
            System.out.printf("El numero ganador era : "+ nroGanador);
        }

    }
}
