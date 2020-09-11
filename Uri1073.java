import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero,contador,quadrado;

        numero = teclado.nextInt();

        for (contador=1; contador<=numero; contador=contador+1){
            if (contador % 2 == 0){
                quadrado = contador * contador;
                System.out.println(contador+"^2 = "+quadrado);
            }
        }
    }
}
