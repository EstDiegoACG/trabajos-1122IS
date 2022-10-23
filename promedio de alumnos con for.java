import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Promedio de alumnos");

        Scanner registros = new Scanner(System.in);
        //cuantos registros
        String nombre;
        double c1, c2, c3, total, promedio = 0.0;

        System.out.println("Ingresa el numero de alumnos");
        int n = registros.nextInt();

        //Empieza el for
        for(int x=1; x<=n; x++){
            System.out.println("Ingrese su nombre");
            nombre = registros.next();
            System.out.println("Ingrese su primera calificacion");
            c1 = registros.nextDouble();
            System.out.println("Ingrese segunda calificacion");
            c2 = registros.nextDouble();
            System.out.println("Ingrese tercera calificacion");
            c3 = registros.nextDouble();

            System.out.println("---Resultados---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Primera calificacion: "+c1);
            System.out.println("Primera calificacion: "+c2);
            System.out.println(""+c3);
            promedio = (c1 + c2 + c3)/3;
            System.out.println("Promedio de" + nombre + ": " + promedio);
        }

        System.out.println("---Promedio de los alumnos---");
        total = (promedio/10)*10;
        System.out.println("El promedio grupal es: "+total);

    }
}