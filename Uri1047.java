import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hi,mi,hf,mf,duri,durf,total,horas,minutos,virada;

        hi = teclado.nextInt();
        mi = teclado.nextInt();
        hf = teclado.nextInt();
        mf = teclado.nextInt();

        duri = (hi * 60) + mi;
        durf = (hf * 60) + mf;
        horas = 0;
        minutos = 0;
        
        if (durf > duri){
            total = durf - duri;
            horas = total / 60;
            minutos = total - (horas * 60);
        }
        else{
            if (durf <= duri){
                virada = durf + 1440;
                total = virada - duri;
                horas = total / 60;
                minutos = total - (horas * 60);
            }
        }  
                       
        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
    }
}
}