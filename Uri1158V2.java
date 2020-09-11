import java.util.Scanner;

public class Uri1158V2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x,y,soma,numero,cont,contador;

        numero = teclado.nextInt();

        for (cont=1; cont <=numero; cont++){    

            x = teclado.nextInt();
            y = teclado.nextInt();
        
            if (x%2==0){
             x = x + 1;
            }
            
            soma = 0;
            for (contador=1; contador<=y; contador=contador+1){
                soma = soma + x;
                x = x + 2;    
            }
            System.out.println(soma);
        }

    }
}