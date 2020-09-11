import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int x;
        double y,consumo;

        x = teclado.nextInt();
        y = teclado.nextDouble();

        consumo = x/y;

        System.out.printf("%.3f\n km/l",consumo);

    }
}