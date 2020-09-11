
import java.util.Scanner;

public class Uri1012{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double a,b,c,pi,tri,cir,tra,qua,ret;


        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        pi = 3.14159;

        tri = (a * c)/2;
        cir = c *c *pi;
        tra = (c*(a + b))/2;
        qua = b * b;
        ret = a * b;

        System.out.printf("TRIANGULO =  %.3f\n",tri);
        System.out.printf("CIRCULO =  %.3f\n",cir);
        System.out.printf("TRAPEZIO =  %.3f\n",tra);
        System.out.printf("QUADRADO =  %.3f\n",qua);
        System.out.printf("RETANGULO = %.3f\n",ret);
    }
}