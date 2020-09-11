import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int intervalo,numero,contador;

        intervalo = teclado.nextInt();

        for (contador=1 ; contador<=intervalo; contador=contador+1){
            numero=teclado.nextInt();

            if (numero == 0){
                System.out.println("NULL");
            }
            else {
                if (numero > 0){
                    if (numero %2 == 0){
                        System.out.println("EVEN POSITIVE");
                    }
                    else{
                        System.out.println("ODD POSITIVE");
                    }
                }
                if (numero < 0){
                    if (numero %2 == 0){
                        System.out.println("EVEN NEGATIVE");
                    }
                    else{
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }

        }

    }
}
