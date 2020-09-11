import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner (System.in);

        int area, baseMaior, baseMenor, altura;

        System.out.print("Informar o valor da base maior: ");
        baseMaior = teclado.nextInt();

        System.out.print("Informar o valor da base menor: ");
        baseMenor = teclado.nextInt();

        System.out.print("Informar o valor da altura: ");
        altura = teclado.nextInt();

        area = ((baseMaior + baseMenor) * 2) / 2;

        System.out.print("O valor da area: " + area);


    }
}