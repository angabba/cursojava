import java.util.Scanner;

public class Uri1157{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero,contador;

        numero = teclado.nextInt();

        for (contador=1; contador<=numero; contador=contador+1){
            if (numero%contador == 0){
                System.out.println(contador);
            }
        } 

    }
}
