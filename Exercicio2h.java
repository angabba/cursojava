import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner (System.in);

        int raio,altura;
        double pi;
        double volume;

        pi = 3.14;

        System.out.print("Informar o valor do raio: ");
        raio = teclado.nextInt();

        System.out.print("Informar o valor da altura: ");
        altura = teclado.nextInt();

        volume = pi * raio * raio * altura;

        System.out.print("O volume calculado: " + volume);

    }
}