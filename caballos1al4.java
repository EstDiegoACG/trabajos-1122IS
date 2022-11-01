import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        //This program remember me a Jojos pt7
        int av1, av2, av3, av4 = 0;
        
        System.out.println("*************Carrera de caballos*************");

        System.out.println("Ingrese cantidad de potros 1-4");
        Scanner readPotro =new Scanner(System.in);
        int caballos = readPotro.nextInt();

        System.out.println("Ingrese que tan grande es el tablero");
        Scanner readTablero = new Scanner(System.in);
        int casillas = readTablero.nextInt();

        int maxCasillas = casillas * casillas;
        System.out.println("El tablero es de: " + maxCasillas + " casillas");

        while (caballos == 1) {
            
            System.out.println("Ingrese nombre del caballo");
            Scanner readName = new Scanner(System.in);
            String name1 = readName.nextLine();

            for (int i = 0; i < maxCasillas; i++) {
                
                Random dado = new Random();
                int numDado;
                numDado = dado.nextInt(6);

                int suma = i + numDado;
                System.out.println(suma);

            }

            System.out.println("");
            System.out.println("La carrera ha terminado");
            caballos = 20;
            //Yes like jojos
        }

        while (caballos == 2) {

            System.out.println("Ingrese nombre del caballo 1");
            Scanner readName = new Scanner(System.in);
            String name1 = readName.nextLine();

            System.out.println("Ingrese nombre del caballo 2");
            Scanner readName2 = new Scanner(System.in);
            String name2 = readName2.nextLine();

            System.out.println(name1 + " VS " + name2);

            int i = 0;
            int j = 0;

            System.out.println("Tiros de: " + name1);

            for (i = 0; i < maxCasillas; i++) {
                
                Random dado = new Random();
                int numDado;
                numDado = dado.nextInt(6);

                int suma = i + numDado;
                System.out.println(suma);

            }

            System.out.println("Tiros de: " + name2);

            for (j = 0; j < maxCasillas; j++) {
                
                Random dado = new Random();
                int numDado;
                numDado = dado.nextInt(6);

                int suma = j + numDado;
                System.out.println(suma);

            }

            System.out.println("");
            System.out.println("La carrera ha terminado");

            System.out.println("");
            Random pos = new Random();
            int ranked;
            ranked = pos.nextInt(2);

            if (ranked == 1) {
                System.out.println("Primer lugar: " + name1);
                System.out.println("Segundo lugar: " + name2);
            } else {
                System.out.println("Primer lugar: " + name2);
                System.out.println("Segundo lugar: " + name1);
            }
            caballos = 20;
        }

        while (caballos == 3) {
            //Steel ball run
            System.out.println("Ingrese nombre del caballo 1");
            Scanner readName = new Scanner(System.in);
            String name1 = readName.nextLine();

            System.out.println("Ingrese nombre del caballo 2");
            Scanner readName2 = new Scanner(System.in);
            String name2 = readName2.nextLine();

            System.out.println("Ingrese nombre del caballo 3");
            Scanner readName3 = new Scanner(System.in);
            String name3 = readName3.nextLine();

            System.out.println(name1 + " VS " + name2 + " VS " + name3);

            int i = 0;
            int j = 0;
            int w = 0;

            System.out.println("Tiros de: " + name1);

            for (i = 0; i < maxCasillas; i++) {
                
                Random dado = new Random();
                int numDado;
                numDado = dado.nextInt(6);

                int suma = i + numDado;
                System.out.println(suma);

            }

            System.out.println("Tiros de: " + name2);

            for (j = 0; j < maxCasillas; j++) {
                
                Random dado = new Random();
                int numDado;
                numDado = dado.nextInt(6);

                int suma = j + numDado;
                System.out.println(suma);

            }

            System.out.println("Tiros de: " + name3);

            for (w = 0; w < maxCasillas; w++) {
                
                Random dado = new Random();
                int numDado;
                numDado = dado.nextInt(6);

                int suma = w + numDado;
                System.out.println(suma);

            }

            System.out.println("");
            System.out.println("La carrera ha terminado");

            System.out.println("");
            Random pos = new Random();
            int ranked;
            ranked = pos.nextInt(6);

            if (ranked == 1) {
                System.out.println("Primer lugar: " + name1);
                System.out.println("Segundo lugar: " + name2);
                System.out.println("Tercer lugar: " + name3);
            }
            if (ranked == 2) {
                System.out.println("Primer lugar: " + name1);
                System.out.println("Segundo lugar: " + name3);
                System.out.println("Tercer lugar: " + name2);
            }
            if (ranked == 3) {
                System.out.println("Primer lugar: " + name2);
                System.out.println("Segundo lugar: " + name1);
                System.out.println("Tercer lugar: " + name3);
            }
            if (ranked == 4) {
                System.out.println("Primer lugar: " + name2);
                System.out.println("Segundo lugar: " + name3);
                System.out.println("Tercer lugar: " + name1);
            }
            if (ranked == 5) {
                System.out.println("Primer lugar: " + name3);
                System.out.println("Segundo lugar: " + name2);
                System.out.println("Tercer lugar: " + name1);
            }
            if (ranked == 6) {
                System.out.println("Primer lugar: " + name3);
                System.out.println("Segundo lugar: " + name1);
                System.out.println("Tercer lugar: " + name2);
            }
            caballos = 20;
        }

        while (caballos == 4) {

            System.out.println("Ingrese nombre del caballo 1");
            Scanner readName = new Scanner(System.in);
            String name1 = readName.nextLine();

            System.out.println("Ingrese nombre del caballo 2");
            Scanner readName2 = new Scanner(System.in);
            String name2 = readName2.nextLine();

            System.out.println("Ingrese nombre del caballo 3");
            Scanner readName3 = new Scanner(System.in);
            String name3 = readName3.nextLine();

            System.out.println("Ingrese nombre del caballo 4");
            Scanner readName4 = new Scanner(System.in);
            String name4 = readName4.nextLine();

            System.out.println(name1 + " VS " + name2 + " VS " + name3 + " VS " + name4);

            int i = 0;
            int j = 0;
            int w = 0;
            int z = 0;

            System.out.println("Tiros de: " + name1);

            for (i = 0; i < maxCasillas; i++) {
                
                Random dado = new Random();
                int numDado;
                numDado = dado.nextInt(6);

                int suma = i + numDado;
                System.out.println(suma);

            }

            System.out.println("Tiros de: " + name2);

            for (j = 0; j < maxCasillas; j++) {
                
                Random dado = new Random();
                int numDado;
                numDado = dado.nextInt(6);

                int suma = j + numDado;
                System.out.println(suma);

            }

            System.out.println("Tiros de: " + name3);

            for (w = 0; w < maxCasillas; w++) {
                
                Random dado = new Random();
                int numDado;
                numDado = dado.nextInt(6);

                int suma = w + numDado;
                System.out.println(suma);

            }

            for (z = 0; z < maxCasillas; z++) {
                
                Random dado = new Random();
                int numDado;
                numDado = dado.nextInt(6);

                int suma = z + numDado;
                System.out.println(suma);

            }

            System.out.println("");
            System.out.println("La carrera ha terminado");

            System.out.println("");
            Random pos = new Random();
            int ranked;
            ranked = pos.nextInt(16);

            if (ranked == 1) {
                System.out.println("Primer lugar: " + name1);
                System.out.println("Segundo lugar: " + name2);
                System.out.println("Tercer lugar: " + name3);
                System.out.println("Cuarto lugar: " + name4);
            }
            if (ranked == 2) {
                System.out.println("Primer lugar: " + name1);
                System.out.println("Segundo lugar: " + name2);
                System.out.println("Tercer lugar: " + name4);
                System.out.println("Cuarto lugar: " + name3);
            }
            if (ranked == 3) {
                System.out.println("Primer lugar: " + name1);
                System.out.println("Segundo lugar: " + name3);
                System.out.println("Tercer lugar: " + name4);
                System.out.println("Cuarto lugar: " + name2);
            }
            if (ranked == 4) {
                System.out.println("Primer lugar: " + name1);
                System.out.println("Segundo lugar: " + name3);
                System.out.println("Tercer lugar: " + name2);
                System.out.println("Cuarto lugar: " + name4);
            }
            if (ranked == 5) {
                System.out.println("Primer lugar: " + name2);
                System.out.println("Segundo lugar: " + name3);
                System.out.println("Tercer lugar: " + name4);
                System.out.println("Cuarto lugar: " + name1);
            }
            if (ranked == 6) {
                System.out.println("Primer lugar: " + name2);
                System.out.println("Segundo lugar: " + name4);
                System.out.println("Tercer lugar: " + name1);
                System.out.println("Cuarto lugar: " + name3);
            }
            if (ranked == 7) {
                System.out.println("Primer lugar: " + name2);
                System.out.println("Segundo lugar: " + name1);
                System.out.println("Tercer lugar: " + name3);
                System.out.println("Cuarto lugar: " + name4);
            }
            if (ranked == 8) {
                System.out.println("Primer lugar: " + name2);
                System.out.println("Segundo lugar: " + name1);
                System.out.println("Tercer lugar: " + name4);
                System.out.println("Cuarto lugar: " + name3);
            }
            if (ranked == 9) {
                System.out.println("Primer lugar: " + name3);
                System.out.println("Segundo lugar: " + name4);
                System.out.println("Tercer lugar: " + name1);
                System.out.println("Cuarto lugar: " + name2);
            }
            if (ranked == 10) {
                System.out.println("Primer lugar: " + name3);
                System.out.println("Segundo lugar: " + name2);
                System.out.println("Tercer lugar: " + name1);
                System.out.println("Cuarto lugar: " + name4);
            }
            if (ranked == 11) {
                System.out.println("Primer lugar: " + name3);
                System.out.println("Segundo lugar: " + name4);
                System.out.println("Tercer lugar: " + name2);
                System.out.println("Cuarto lugar: " + name1);
            }
            if (ranked == 12) {
                System.out.println("Primer lugar: " + name3);
                System.out.println("Segundo lugar: " + name2);
                System.out.println("Tercer lugar: " + name4);
                System.out.println("Cuarto lugar: " + name1);
            }
            if (ranked == 13) {
                System.out.println("Primer lugar: " + name4);
                System.out.println("Segundo lugar: " + name1);
                System.out.println("Tercer lugar: " + name2);
                System.out.println("Cuarto lugar: " + name3);
            }
            if (ranked == 14) {
                System.out.println("Primer lugar: " + name4);
                System.out.println("Segundo lugar: " + name2);
                System.out.println("Tercer lugar: " + name3);
                System.out.println("Cuarto lugar: " + name1);
            }
            if (ranked == 15) {
                System.out.println("Primer lugar: " + name4);
                System.out.println("Segundo lugar: " + name3);
                System.out.println("Tercer lugar: " + name2);
                System.out.println("Cuarto lugar: " + name1);
            }
            if (ranked == 16) {
                System.out.println("Primer lugar: " + name4);
                System.out.println("Segundo lugar: " + name3);
                System.out.println("Tercer lugar: " + name1);
                System.out.println("Cuarto lugar: " + name2);
            }
            caballos = 0;
        }

    }
}
