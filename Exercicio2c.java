import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado;
        teclado  = new Scanner(System.in);

        int area,base,altura;

        System.out.print("Informe o valor da base: ");
        base = teclado.nextInt();

        System.out.print("Informe o valor da altura: ");
        altura = teclado.nextInt();

        area = (base * altura) / 2;

        System.out.print("O valor da area: " + area);
               

    }
}