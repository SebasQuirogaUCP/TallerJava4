package taller4;

import java.util.Scanner;

public class Ejercicio1 {
    
    Scanner tx = new Scanner(System.in);
//Arreglo que contiene los 5 numeros
private int n[]= new int[5];

    public void Ejercicio1(){
    }
    
    public void Ejercicio1(int n[]){
        this.n=n;
    }
    
    public void ejecutar(){

        
        int temp2=10;
        
        System.out.println("Ingrese numero no repetido entre 10 y 100");
        n[0]=tx.nextInt();
    
        
    if(n[0]>= 10 && n[0]<=100){
            int i=1;
            while(i<6){
                
                System.out.println("Ingrese numeros no repetido entre 10 y 100");
                temp2=tx.nextInt();
                
                    //REVISANDO SEGUNDO NUMERO CON RESPECTO AL PRIMERO
                    if(temp2 != n[i-1]){
                        n[1]=temp2;
                        System.out.println(n[0]+" "+n[1]);
                        i++;
                    } else{
                        System.err.println("Numero repetido");
                        System.out.println("Vuelva a Ingresar numero NO repetido");
                        temp2=tx.nextInt();
                            if(temp2 != n[i-1]){
                            n[i]=temp2;
                            System.out.println(n[i]);
                            i++;
                            } else{System.err.println("Adios, Usted ha ingresado un numero repetido");
                                    System.exit(0);
                            }
                    } 
                    
                    //REVISANDO TERCER NUMERO
                    temp2=tx.nextInt();
                    if(temp2 != n[i-1] && temp2 != n[i-2]){
                        n[i]=temp2;
                        System.out.println(n[i]);
                        i++;
                    }   else{ 
                        System.err.println("Numero repetido");
                        System.out.println("Vuelva a Ingresar numero NO repetido");
                        temp2=tx.nextInt();
                            if(temp2 != n[i-1] && temp2 != n[i-2]){
                            n[i]=temp2;
                            System.out.println(n[i]);
                            i++;
                            } else{System.err.println("Adios, Usted ha ingresado un numero repetido");
                                    System.exit(0);
                            }

                        }
                    
                    //REVISANDO CUARTO NUMERO
                    temp2=tx.nextInt();
                    if(temp2 != n[i-1] && temp2 != n[i-2] && temp2 != n[i-3]){
                        n[i]=temp2;
                        System.out.println(n[i]);
                        i++;
                    }   else{ 
                        System.err.println("Numero repetido");
                        System.out.println("Vuelva a Ingresar numero NO repetido");
                        temp2=tx.nextInt();
                        
                            if(temp2 != n[i-1] && temp2 != n[i-2] && temp2 != n[i-3]){
                            n[i]=temp2;
                            System.out.println(n[i]);
                            i++;
                            } else{System.err.println("Adios, Usted ha ingresado un numero repetido");
                                    System.exit(0);
                            }
                    }
                    
                    //REVISANDO QUINTO NUMERO
                    temp2=tx.nextInt();
                    if(temp2 != n[i-1] && temp2 != n[i-2] && temp2 != n[i-3] && temp2 != n[i-4]){
                        n[i]=temp2;
                        System.out.println(n[i]);
                        i+=2;
                    }   else{ 
                        System.err.println("Numero repetido");
                        System.out.println("Vuelva a Ingresar numero NO repetido");
                        temp2=tx.nextInt();
                        
                            if(temp2 != n[i-1] && temp2 != n[i-2] && temp2 != n[i-3]){
                            n[i]=temp2;
                            System.out.println(n[i]);
                            i++;
                            } else{System.err.println("Adios, Usted ha ingresado un numero repetido");
                                    System.exit(0);
                            }
                        
                        
                    }
                    
                    
                    
                    
            }
            
         }  else{System.err.println("Numero no permitido");
            System.exit(0);
            }
        
        
 }








}
