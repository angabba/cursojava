import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod1,num1,cod2,num2;
        double vu1,vu2,valor1,valor2,valor;

        cod1 = teclado.nextInt();
        num1 = teclado.nextInt();
        vu1  = teclado.nextDouble();
        cod2 = teclado.nextInt();
        num2 = teclado.nextInt();
        vu2  = teclado.nextDouble();

        valor1 = num1 * vu1;
        valor2 = num2 * vu2;

        valor = valor1 + valor2;

        System.out.printf("VALOR A PAGAR: %.2f\n",valor);
        


    }
}