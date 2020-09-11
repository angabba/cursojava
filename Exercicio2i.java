import java.util.Scanner;

public class Exercicio2i{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner (System.in);
        
        float raio,altura,volume,pi;

        System.out.println("Digite o valor do raio e altura: ");
        raio = teclado.nextFloat();
        altura = teclado.nextFloat();
        pi = 3.14f;

        volume = raio * raio * pi * altura;

        System.out.println("O volume: "+volume);

        System.out.printf("O volume com 1 casa decimal vale %.1f\n",volume);
    }
}  

