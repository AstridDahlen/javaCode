import java.util.*;
public class Faktor {


    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int sum= 1;
        System.out.println(" Enter a number to factorize: ");
        int x =value.nextInt();

        for (int i=x;i>1;i--){
            sum=sum*i;
        }
        System.out.println( x + "i"+" = " +sum );
    }

}