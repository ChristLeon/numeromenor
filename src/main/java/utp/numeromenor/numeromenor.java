package utp.numeromenor;

import java.util.Scanner;

public class numeromenor {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea evaluar");
        
        int cantidadNumeros= scanner.nextInt();
        int numeroMenor=0;
        
        for (int i = 0;i < cantidadNumeros;i++){
            System.out.println("Digite el numero "+(i+1)+" :"); 
            int tmp=scanner.nextInt();
            if(i==0){
                numeroMenor=tmp;
            }else if(tmp<numeroMenor){
                numeroMenor=tmp;
            }
        }
        System.out.println("El numero mayor es: "+numeroMenor);
    }
    
}
