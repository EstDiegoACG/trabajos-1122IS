import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Desea encender el elevador"); 

        System.out.println("0 = si"); 

        Scanner x = new Scanner(System.in); 

        int boton = x.nextInt(); 

        int personasEdificio, botonUno, contador;
        contador = 0; 
        botonUno = 0;
        personasEdificio = 100;

        System.out.println("Cuantas llaves hay en el edificio");
        Scanner readTablero = new Scanner(System.in); 
        int llaves = readTablero.nextInt();

        while (boton <= 1) { 
             
            System.out.println("Ingrese accion que quiere hacer"); 
            System.out.println("1 = subir personas");  
            System.out.println("2 = Bajar todas las personas de un piso"); 
            System.out.println("3 = Bajar personas de un piso");
            Scanner readMenu = new Scanner(System.in); 
            int menu = readMenu.nextInt(); 

            while(menu == 1){
                System.out.println("Ingrese las personas a subir"); 
                Scanner readSubirp = new Scanner(System.in); 
                int op1 = readSubirp.nextInt();
                int variableSubir = 0; 
                variableSubir = op1 / 5; 
                if (op1 <= 5) { 
                System.out.println("El elevador dara una vuelta para subir " + op1 + " Personas"); 
                } 
                System.out.println("El elevador dara: " + variableSubir + " vueltas para subir de 5 en 5"); 

                contador = op1 + personasEdificio;
                int personasIn = contador - llaves;
                int mediaPiso = personasIn/5;

                System.out.println("Desea ver El promedio de personas en el edificio");
                System.out.println("1 = Si");
                System.out.println("2 = No");
                Scanner readParteDos = new Scanner(System.in); 
                int ver = readParteDos.nextInt();

                if (ver == 1) {
                    System.out.println();
                    System.out.println("-----Elevador-----");
                    System.out.println("Personas En el edificio: " + contador);
                    //System.out.println("Personas que han salido: " + personasIn);
                    System.out.println("Con una media actual de: " + mediaPiso + " Por piso");
                    System.out.println("**Tenga buen día**");
                    System.out.println();    
                }
                menu = 4;
            }

            while (menu == 2) {
                System.out.println("piso: "); 
                Scanner loby = new Scanner(System.in); 
                int persona = loby.nextInt(); 

                System.out.println("Max personas en el piso"); 
                Scanner lobyMax = new Scanner(System.in); 
                int personaMax = lobyMax.nextInt(); 

                int maxBajada = 0; 
                maxBajada = personaMax / 5; 

                if (personaMax <= 5) { 
                    System.out.println("El elevador dara una vuelta para subir " + personaMax + " Personas"); 
                } 
                System.out.println("El elevador dara: " + maxBajada + " vueltas para bajar de 5 en 5");
                
                contador = maxBajada - personasEdificio;
                //int personasIn = contador - llaves;
                int mediaPiso = contador/5;
                //Jojo
                System.out.println("Desea ver Cuantas personas quedan");
                System.out.println("1 = Si");
                System.out.println("2 = No");
                Scanner readParteDos = new Scanner(System.in); 
                int ver = readParteDos.nextInt();
                //Joestar
                if (ver == 1) {
                    System.out.println();
                    System.out.println("-----Elevador-----");
                    System.out.println("Personas que bajaron: " + maxBajada);
                    System.out.println("Personas que quedan: " + contador);
                    System.out.println();    
                }
                menu = 4;
            }
            while (menu == 3) {
                System.out.println("piso: "); 
                Scanner lobyCito = new Scanner(System.in); 
                int persona2 = lobyCito.nextInt(); 

                System.out.println("personas que quiere bajar"); 
                Scanner lobyMin = new Scanner(System.in); int personaMin = lobyMin.nextInt(); 
                int minBajada = 0;

                minBajada = personaMin / 5; 

                if (personaMin <= 5) { 
                System.out.println("El elevador dara una vuelta para subir " + personaMin + " Personas"); 
                } 
                System.out.println("El elevador dara: " + minBajada + " vueltas para bajar de 5 en 5");

                contador = personaMin - personasEdificio;
                int personasIn = contador - llaves;
                int mediaPiso = personasIn/5;
                
                System.out.println("Desea ver Cuantas personas hay en el edificio");
                System.out.println("1 = Si");
                System.out.println("2 = No");
                Scanner readParteDos = new Scanner(System.in); 
                int ver = readParteDos.nextInt();

                if (ver == 1) {
                    System.out.println();
                    System.out.println("-----Elevador-----");
                    System.out.println("Personas En el edificio: " + contador);
                    System.out.println("Personas que han salido: " + personasIn);
                    System.out.println("Con una media de: " + mediaPiso + " Por piso");
                    System.out.println("**Tenga buen día**");
                    System.out.println();    
                }
                menu = 4;

            }
        } 
    } 
}