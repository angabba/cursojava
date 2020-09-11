import java.util.Scanner;

public class Uri1154{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idade,contador,soma;
        double media;
        contador=0;
        soma=0;
        
        do {
            idade = teclado.nextInt();

            if (idade > 0){
                contador = contador + 1;
                soma = soma + idade;
            }
            
        } while (idade > 0);

        media = soma / contador;
        System.out.printf("%.2f\n",media);

    }
}
