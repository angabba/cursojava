import java.util.Scanner;

public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado;                       // declarado componente do tipo scanner chamado teclado
        teclado = new Scanner(System.in);      //o componente vai ler dados do dispositivo de entrada padrão

        int lado, area;

        System.out.println("Por favor informe o valor do lado do quadrado");
        lado = teclado.nextInt();

        area = lado * lado;

        System.out.println("A area do quadrado vale " +area);

    }
}