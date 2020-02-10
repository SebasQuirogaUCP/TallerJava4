package taller4;
public class Ejercicio3 {
private int arr[] = new int[5];

    public void Ejercicio3(){
    }
    public void Ejercicio3(int arr[]){
    this.arr=arr;
    }
    public void ejecutarCal3(){
    
        int entra=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                //En la misma posicion va hacer el mismo valor
                //Verificamos las demas posiciones 
                if( i!=j){
                    if(arr[i]==arr[j]){
                    arr[i]=-5;
                    entra=entra+1;
                    }
                }
            }
        }
    
    for(int i=0; i<5; i++){
        System.out.print(arr[i]+" ");
        
    }
    
    System.out.println("Numero de entradas modificadas "+entra);
    }
    
    
}
