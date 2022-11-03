import java.util.Random;
import java.util.Scanner;
//La inspiracion provino de tres cosas 
public class App {
    public static void main(String[] args) throws Exception {
       
        System.out.println("****Carrera de caballos****");
        System.out.println("ingrese el largo del estadio:");
        Scanner a = new Scanner(System.in);
        int altura = a.nextInt();

        System.out.println("ingrese el ancho del estadio:");
        Scanner b = new Scanner(System.in);
        int base = b.nextInt();
        //El sueño dorado
        int estadio = altura * base;
        System.out.println("El estadio mide: " + estadio); 

        System.out.println("Presione 1 para iniciar la carrera");
        Scanner readStart = new Scanner(System.in);
        int inicio = readStart.nextInt();

        while (inicio == 1) {

            for(int j = 1; j < 100; j++) {
            
            System.out.println("ingrese el Nombre del caballo:");
            Scanner readName = new Scanner(System.in);
            String nombre = readName.nextLine();
                //Passione, fake, the real think is ciberseguridad
            System.out.println("Inician las tiradas");

            for (int i = 0; i < estadio; i++) {
                
                Random dado = new Random();
            	int num1;
                num1 = dado.nextInt(6);

                int sumador = num1 + i;
//Mi serie animada donde hacen un videojuego
                System.out.println(sumador);
            }
//Because quiero hacer videojuegos
            System.out.println("");
            System.out.println("*****Podio*****");
            System.out.println("_______________");
            System.out.println("El nombre del caballo es: " + nombre);
            System.out.println("Acabo en la posicion: " + j);
            System.out.println("Felicidades por completar la acarrera!!");
            System.out.println("_______________");
            System.out.println("");

            }
        }
    }
    //Tuve la solucion al despertarme xd
}
