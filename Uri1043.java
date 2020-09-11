import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double a,b,c,area,peri;

        System.out.print("Digite os tres valores:");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        if ( ((a + b) > c) && ((a + c) > b) && ((c + b) > a)){
            peri = a + b + c;
            System.out.printf("Perimetro: %.1f",peri);
        }
        else{
            area = ((a + b) * c) / 2;
            System.out.printf("Area: %.1f",area);
        }    
      
    }
}