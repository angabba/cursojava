import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int opcao,alcool,gasolina,diesel;
        alcool = 0;
        gasolina = 0;
        diesel = 0;
 
        do {

            System.out.println("1.Alcool 2.Gasolina 3.Diesel 4.Saida");
            opcao = teclado.nextInt();

            if (opcao == 1){
                alcool = alcool + 1;
            }
            else if (opcao == 2){
                gasolina = gasolina + 1;
            }
            else if (opcao == 3){
                diesel = diesel + 1;
            }else if (opcao == 4){

            }
            
        } while (opcao != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);

    }
}
