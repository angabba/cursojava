import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero,contador,a,b,c;
        a=1;
        b=2;
        c=3;
        
        numero = teclado.nextInt();

        for (contador=1; contador<=numero; contador=contador+1){
            System.out.println(a+" "+b+" "+c+" PUM");
            a = a + 4;
            b = b + 4;
            c = c + 4;
        }
    }
}
