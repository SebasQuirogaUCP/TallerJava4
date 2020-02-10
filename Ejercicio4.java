package taller4;
import java.util.Random;
public class Ejercicio4 {

private int arr1[] = new int[20];
private int arr2[] = new int[20];
private int temp;
private int temp2;

        public void Ejercicio4(){
        }
        
        public void ejecutarCal4(){
            System.out.println(">>>>>>>>>>EJERCICIO 4!<<<<<<<<<<<<");
            temp=0;
            temp2=0;
            int t=0;
            while(t<20){
                arr1[t]=(int)(Math.random()* 20) +1;
                t++;
            }
            
            for(int i=0; i<20 ; i++){
            arr2[i]=arr1[i];
            }
            //SUMANDO PRIMEROS 10 NUMEROS
            int ii=0;
            while(ii<=9){
                     temp=arr1[ii]+arr1[ii+1]+temp;
                     //System.out.println("DENTRO DE CICLO 1: "+ii);
                    ii++;
                }
            
            System.out.println("Suma de primero 10 numeros: "+temp);
            
            //SUMANDO DEL 11 AL 20
            int i=10;
            //HASTA 18 DEBIDO A QUE POR LA SUMA DE LOS ARRAY LLEGA HASTA EL TOPE
            while(i<18)
                {
                    temp2=arr1[i]+arr1[i+1]+temp2; 
                    //System.out.println("DENTRO DE CICLO 2: "+i);
                i++;
                }
            
            System.out.println("Suma de primero 11-20 numeros: "+temp2);
            
            
            int v=0;
            while(temp<temp2){
                arr1[v]=20;
                temp2=temp2-arr1[v];
                v++;
                }
                
            System.out.println("Arreglo original");
            for(int iii=0; iii<20; iii++){
                System.out.print(arr2[iii]+" ");
            }
            
            System.out.println("\n");
            System.out.println("Arreglo modificado");
            for(int i4=0; i4<20; i4++){
                System.out.print(arr1[i4]+" ");
            }
            System.out.println("\n");
            System.out.println("Puede presionar la tecla 4 para continuar con el este ejercicio hasta que los \n primeros 10 numeros sean meyores a los demas");
            System.out.println("\n");
            System.out.println("**********************************************");
            }
            
            
                
            }
            
                
    
    
    
