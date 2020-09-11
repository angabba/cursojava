import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int horaini,horafim,duracao;

        horaini=teclado.nextInt();
        horafim=teclado.nextInt();

        duracao = horafim - horaini;

        if (duracao <= 0){
            duracao = duracao + 24;
        }
        else{
            duracao = duracao;
        }        
        System.out.println("O JOGO TEVE DURACAO DE " + duracao + " HORA(S)");
     
    }
}