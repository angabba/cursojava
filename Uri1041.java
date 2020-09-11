import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double x,y;

        System.out.print("Digite as coordenadas x e y:");
        x = teclado.nextDouble();
        y = teclado.nextDouble();

        if (x==0 && y==0){
            System.out.print("Origem");
        }
        else{
            if (x == 0){
                System.out.print("Y");
            }
            else{
                if (y == 0){
                    System.out.println("X");
                }
                else{
                    if (x>0 && y>0){
                        System.out.print("Q1");
                    }
                    else{
                        if (x>0 && y<0){
                            System.out.print("Q4");
                        }
                        else{
                            if (x<0 && y<0){
                                System.out.print("Q3");
                            }
                            else{
                                System.out.print("Q2");
                            }
                        }
                    }
                }
            }
        }

    }
}

    

