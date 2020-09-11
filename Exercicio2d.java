import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int area,diagonal1,diagonal2;

        System.out.print("Informe o valor da diagonal 1: ");
        diagonal1 = teclado.nextInt();

        System.out.print("Informe o valor da diagonal 2: ");
        diagonal2 = teclado.nextInt();

        area = diagonal1 * diagonal2;

        System.out.print("O valor da area: " + area);
        
    }
}