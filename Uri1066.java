import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int contador,par,impar,pos,neg;
        double numero;
        par=0;
        impar=0;
        pos=0;
        neg=0;

        for (contador=1; contador<=5; contador=contador+1){
            numero = teclado.nextDouble();
            if (numero > 0){
                pos = pos + 1;
            }
            else {
                if (numero < 0){
                    neg = neg + 1;
                }
            }
            if (numero % 2 == 0){
                par = par + 1;
            }
            else {
                impar = impar + 1;
            }
        }

        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(pos+" valor(es) positivo(s)");
        System.out.println(neg+" valor(es) negativo(s)");

    }
}
