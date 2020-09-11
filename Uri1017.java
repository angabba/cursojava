import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo,velocidade,distancia;
        double litro;

        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();

        distancia = velocidade * tempo;
        litro = distancia / 12.00;

        System.out.printf("%.3f\n",litro); 
    }
}