import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int numero,contador;

        numero = teclado.nextInt();

        if (numero %2 == 0){
            numero = numero +1;
        }

        for (contador=1; contador<=6; contador=contador+1){
            System.out.println(numero);
            numero = numero + 2;
            
        }
    
    }
}
