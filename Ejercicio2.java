package taller4;

import java.util.Scanner;

public class Ejercicio2 {
    
Scanner tx = new Scanner(System.in);
private double num[] =new double[10];
double temp=0;

    public void Ejercicio2(){
    }
    public void Ejercicio2(double num[]){
    this.num=num;
    }
    
    public void ejecutarCal(){
        for(int i=0; i<10 ; i++){
        System.out.println("Ingrese numero decimal con comas (,)  "+(i+1));
        num[i]=tx.nextDouble();
        }
        
        //Media aritmetica
        for(int j=0; j<10;j++){
        temp= num[j]+temp;
        }
        
        //IMPRIMIR EN ORDEN INVERSO
        int j=9;
        while(j>=0)
        {
            System.out.print(num[j] + "  ");
            j=j-1;
        }
        
        System.out.println("Media Aritmetica: "+(temp/10));
        /*************************/
        
    }
    
}
