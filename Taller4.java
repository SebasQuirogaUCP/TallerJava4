package taller4;

import java.util.Scanner;

public class Taller4 {
    public static void main(String[] args) {
    Scanner tx = new Scanner(System.in);
    Ejercicio1 eje1 = new Ejercicio1();
    Ejercicio1_1 eje1_1 = new Ejercicio1_1();
    Ejercicio2 eje2 = new Ejercicio2();
    Ejercicio3 eje3 = new Ejercicio3();
    Ejercicio4 eje4 = new Ejercicio4();
    
    
        System.out.println("Taller numero 4");
        System.out.println("***************\n");
        int temp=0;
    do{
        System.out.println("Ingrese numero del ejercicio:");
        System.out.println("Si desea salir ingrese 5");
        temp=tx.nextInt();
        
        
        switch(temp){
                case 1:
                    eje1_1.ejecutarCal1();
                    break;
                case 2:
                    eje2.ejecutarCal();
                    break;
                case 3:
                    int arr[] = new  int[5];
                    System.out.println("Ingrese arreglo de 5 posiciones");
                    
                    for(int i=0;i<5;i++){
                    arr[i]=tx.nextInt();
                    }
                    eje3.Ejercicio3(arr);
                    eje3.ejecutarCal3();
                    break;
        
                case 4:
                    eje4.ejecutarCal4();
                    
                    break;
                    
                default:
                    System.out.println("Usted ha ingresado un numero incorreco de ejercicio\nVuelva a digitar numero entre 1-4");
        }
        
    }while(temp!=5);
        
        
        
    }
    
}
