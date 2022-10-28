import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("---Helices---");
        int n = 0;

        System.out.println("Ingrese del 1-6 cuantas vueltas dieron las helices");
        n = num.nextInt();

        Random hel = new Random();
        int helice;

        helice = hel.nextInt(6);

        if(n < helice){
            System.out.println("Perdiste, la helice giro: "+helice+" veces");
        }
        if(n == helice){
            System.out.println("Empate, giro de: "+helice+" veces");
        }
        if(n > helice){
            System.out.println("Ganaste !!!!, tu: "+n+" helice: "+helice);
        }

    }
}