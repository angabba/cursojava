public class Continhas{
    public static void main(String args[]){
        int a,b,c;

        a = 10;
        b = 7;

        c = a + b;
        System.out.println("O valor da soma:" + c);

        c = a - b;
        System.out.println("O valor da subtracao:" + c);

        c = a * b;
        System.out.println("O valor da multiplicacao:" + c);

        c = a / b;
        System.out.println("O valor da divisao:" + c);
        
        c = a % b;
        System.out.println("O resto da subtracao:" + c);

        float x;
        x = 1.0f/3;

        System.out.println("Valor de x:" + x);
        System.out.printf("O Valor de x: %.2f   -  %.5f   -  %.3f",x,x,x);



    }
}