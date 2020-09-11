import java.util.Scanner;

public class Exercicio2f{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner (System.in);

        int volume,altura,largura,profundidade;

        System.out.print("Informe o valor da altura: ");
        altura = teclado.nextInt();

        System.out.print("Informe o valor da largura: ");
        largura = teclado.nextInt();

        System.out.print("Informe o valor da profundidade: ");
        profundidade = teclado.nextInt();

        volume = altura * largura * profundidade;

        System.out.print("O volume: " + volume);
    }
}

