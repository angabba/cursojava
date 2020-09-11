import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int contador,par;
        double numero;
        par=0;

        for (contador=1; contador<=5; contador=contador+1){
            numero = teclado.nextDouble();
            if (numero % 2 == 0){
                par = par + 1;
            }
        }
        System.out.println(par+" valores pares");

    }
}

    
