import java.util.Scanner;

public class Exercicio2g{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner (System.in);

        int volume, lado;

        System.out.print("Informar o valor do lado: ");
        lado = teclado.nextInt();

        volume = lado * lado * lado;

        System.out.print("O volume calculado: " + volume);

    }
}