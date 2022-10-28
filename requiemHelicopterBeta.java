import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner turnos = new Scanner(System.in);
        int n1,n2,n3,ataque, life2, mech2 = 0;

            int life = 50;
            int mech = 50;

            System.out.println("Ingrese primer numero de ataque 1-10");
            n1 = turnos.nextInt();

            System.out.println("Ingrese segundo numero de ataque 1-10");
            n2 = turnos.nextInt();

            System.out.println("Ingrese tercer numero de ataque 1-10");
            n3 = turnos.nextInt();

            ataque = n1+n2+n3;

            Random hel = new Random();
            int helice;

            helice = hel.nextInt(30);

            System.out.println(helice);

            life2 = life - helice;
            mech2 = mech - ataque;

            if (life2 < mech2){
                System.out.println("La maquina ha ganado");
            }
            if (life2 > mech2){
                System.out.println("Tu ganaste");
            }

            while (life2 == mech2){
                System.out.println("Modo Requiem");

                //to do ataques infinitos hasta llegar a 500 y que se vea el damage de los ataques

            }
    }
}