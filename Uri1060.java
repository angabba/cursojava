import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int contador,pos;
        double numero;
        pos=0;

        for (contador=1; contador<=6; contador=contador+1){
            numero = teclado.nextDouble();
            if (numero > 0){
                pos = pos + 1;
            }
        }
        System.out.println(pos+" valores positivos");
    }

}