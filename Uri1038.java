import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod,qtd;
        double valor;
    
        System.out.println("Digite o codigo e a quantidade:");
        cod = teclado.nextInt();
        qtd = teclado.nextInt();
        valor = 0;
        
        if (cod == 1){
            valor = qtd*4.0;
        }
        else{
            if (cod == 2){
                valor = qtd*4.5;
            }
            else{
                if (cod == 3){
                    valor = qtd*5.0;
                }
                else{
                    if (cod == 4){
                        valor = qtd*2.0;
                    }
                    else{
                        if (cod == 5){
                            valor = qtd*1.5;
                        }
                    }
                }
            }
        }  
        System.out.printf("Total: R$ %.2f",valor);            
    }
}