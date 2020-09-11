import java.util.Scanner;

public class Uri1036{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double a,b,c,d,delta,x1,x2;

        a=teclado.nextDouble();
        b=teclado.nextDouble();
        c=teclado.nextDouble();
              
        delta = (b*b) - (4 * a * c);

        if ((a == 0) || (delta < 0)){
            System.out.println("Impossivel calcular");
        }
        else{
            d = Math.sqrt(delta);
            x1 = ((- b) + d) / (2 * a);
            x2 = ((- b) - d) / (2 * a);

            System.out.printf("R1 = %.5f\n",x1);
            System.out.printf("R2 = %.5f\n",x2);
        }

    }
}