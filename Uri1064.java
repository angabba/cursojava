import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int contador,pos;
        double numero,media;
        pos=0;
        media=0;

        for (contador=1; contador<=6; contador=contador+1){
            numero = teclado.nextDouble();
            if (numero > 0){
                pos = pos + 1;
                media = media + numero;
            }
        }
        media = media/pos;
        System.out.println(pos+" valores positivos");
        System.out.printf("%.1f",media);
    }
}