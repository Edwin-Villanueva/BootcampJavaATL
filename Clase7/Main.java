package Clase7;
import java.util.Scanner;

public class Main {
    public static  void  main (String args []){
        Scanner lector =  new Scanner(System.in);
        double arrayNumeros [] = new double[5];

        for(int i= 0 ; i<arrayNumeros.length  ; i++){

            System.out.println("ingrese un numero");
            arrayNumeros[i]=lector.nextInt();

        }
        System.out.println("Los numeros ingresados fueron : ");

        for(int i= 0 ; i<arrayNumeros.length  ; i++){
            System.out.print(arrayNumeros[i] + " ,");
        }

        double menor=999999;
        double mayor=-1;
        for(int i= 0 ; i<arrayNumeros.length  ; i++){
            if(arrayNumeros[i]< menor){
                menor=arrayNumeros[i];
            }
            if(arrayNumeros[i]>mayor){
                mayor=arrayNumeros[i];
            }
        }
        System.out.println("el mayor : "+mayor + " y el menor : "+ menor);

        double promedio ;
        double sumatoria=0;
        for (int i = 0; i < arrayNumeros.length; i++) {
            sumatoria +=arrayNumeros[i];
        }
        promedio = sumatoria /arrayNumeros.length;
        System.out.printf("El promedio de los numeros es : " + promedio);




    }
}
