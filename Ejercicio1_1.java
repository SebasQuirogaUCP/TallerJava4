package taller4;

import java.util.Scanner;
import javax.xml.transform.Source;

public class Ejercicio1_1 {
private int n[] = new int[5];    
Scanner tx = new Scanner(System.in);

    public void Ejercicio1_1(){
    }
    
    public void ejecutarCal1(){

            /*System.out.println("Ingrese numero no repetido entre 10 y 100");    
            n[0]=tx.nextInt();*/

            
                    int i=0;
                    while(i<5){
                        System.out.println("Ingrese numeros no repetido entre 10 y 100");
                        n[i]=tx.nextInt();
                        
                        if(n[i]>= 10 && n[i]<=100){
                        
                        int j=0;
                        while(j<i){
                                if(n[i] != n[j]){
                                    System.out.println(n[j]);
                                    
                                } else
                                {
                                    System.out.println("Numero repetido");
                                    System.out.println("Ingrese numeros no repetido entre 10 y 100");
                                    n[i]=tx.nextInt();
                                    
                                      
                                }
                                j++;
                            
                         
                        
                        }
                        
                        
                        
                    } else {
                            System.out.println("Us ha ingresado un numero fuera de rango");
                        }
        i++;
        }
        System.out.println("*************************\n\n");
    }
    
}
