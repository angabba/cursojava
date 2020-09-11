public class Uri1155{
    public static void main(String args[]){
   
        int n;
        double s;

        s=0;

        for (n=1; n<=100; n=n+1){
            s = s + (1.0/n);
        }

        System.out.printf("%.2f",s);
    }
}
