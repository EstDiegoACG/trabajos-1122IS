import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Han desafiado a los caballos!!");
        System.out.println("Quien sera mas rapido");
        System.out.println("Caballos o Autos");

        System.out.println("****Selecciona tu personaje****");
        System.out.println("1 = Gyro");
        System.out.println("2 = Jony");
        System.out.println("3 = Dio");
        System.out.println("4 = Crear Personaje");
        Scanner personaje = new Scanner(System.in);
        int character = personaje.nextInt();

        System.out.println("Avanza niveles para ganar al auto que ha dejado obstaculos");

        if (character == 1) {
            System.out.println("");
            System.out.println("***Gyro***");

            Random velocidad = new Random();
            int velocidadCaballo;
            velocidadCaballo = velocidad.nextInt(10);

            Random fuerza = new Random();
            int fuerzaCaballo;
            fuerzaCaballo = fuerza.nextInt(10);

            System.out.println("Velocidad: " + velocidadCaballo);
            System.out.println("Fuerza: " + fuerzaCaballo);

            System.out.println("Mision de Gyro: 1 = start");
            Scanner m1 = new Scanner(System.in);
            int mision1 = m1.nextInt();

            while (mision1 == 1) {
                System.out.println("Ha aparecido un bandido!!");
                System.out.println("Fuerza del bandido: 7");
                int fb = 7;
                System.out.println("Velocidad del bandido: 1");
                int vb = 2;
                System.out.println("--------------------------");
                System.out.println("Tu fuerza: " + fuerzaCaballo);
                System.out.println("Tu Velocidad: " + velocidadCaballo);

                System.out.println("1: Atacar");
                System.out.println("2: Avanzar");
                Scanner readAccion = new Scanner(System.in);
                int accion = readAccion.nextInt();

                while (accion == 1) {
                    if (fuerzaCaballo>=fb) {
                        System.out.println("Bien, bandido acabado");
                    } else {
                        System.out.println("No puedes atacar, SU FUERZA ES MAYOR!!");
                    }
                    accion = 3;
                }
                while (accion == 2) {
                    if (velocidadCaballo>=vb) {
                        System.out.println("Adelantado con exito!");
                    } else {
                        System.out.println("No puedes escapar, SU FUERZA ES MAYOR!!");
                    }
                    accion = 3;
                }

                System.out.println("Te has encontrado al auto!!!!");
                int velocidadAuto = 0 + velocidadCaballo;
                int fuerzaAuto = 0 + fuerzaCaballo;
                System.out.println("Fuerza del Auto: " + fuerzaAuto);
                System.out.println("Velocidad del Auto: " + velocidadAuto);

                System.out.println("--------------------------");
                System.out.println("Tu fuerza: " + fuerzaCaballo);
                System.out.println("Tu Velocidad: " + velocidadCaballo);

                System.out.println("1: Atacar");
                System.out.println("2: Avanzar");
                Scanner readAccion2 = new Scanner(System.in);
                int accion2 = readAccion2.nextInt();

                while (accion2 == 1) {
                    if (fuerzaCaballo>=fb) {
                        System.out.println("Has retrasado su avance");
                    }
                    accion2 = 3;
                }
                while (accion2 == 2) {
                    if (velocidadCaballo>=vb) {
                        System.out.println("Ganaste un poco de delantera");
                    }
                    accion2 = 3;
                }

                System.out.println("Un acantilado!!!!");
                System.out.println("El caballo no tiene la fuerza para evitarlo");
                System.out.println("*****Has muerto*****");

                mision1 = 90;
            }
            
        }
        if (character == 2) {
            System.out.println("");
            System.out.println("***Jony***");

            Random velocidad = new Random();
            int velocidadCaballo;
            velocidadCaballo = velocidad.nextInt(10);

            Random fuerza = new Random();
            int fuerzaCaballo;
            fuerzaCaballo = fuerza.nextInt(10);

            System.out.println("Velocidad: " + velocidadCaballo);
            System.out.println("Fuerza: " + fuerzaCaballo);

            System.out.println("Mision de Jony: 1 = start");
            Scanner m1 = new Scanner(System.in);
            int mision1 = m1.nextInt();

            while (mision1 == 1) {
                System.out.println("Espias te estan siguiendo!!!!");
                System.out.println("Fuerza de los espias: 2");
                int fb = 2;
                System.out.println("Velocidad cuando corren: 2");
                int vb = 2;
                System.out.println("--------------------------");
                System.out.println("Tu fuerza: " + fuerzaCaballo);
                System.out.println("Tu Velocidad: " + velocidadCaballo);

                System.out.println("1: Atacar");
                System.out.println("2: Avanzar");
                Scanner readAccion = new Scanner(System.in);
                int accion = readAccion.nextInt();

                while (accion == 1) {
                    if (fuerzaCaballo>=fb) {
                        System.out.println("Espias Abatidos");
                    } else {
                        System.out.println("No puedes atacar, SU FUERZA ES MAYOR!!");
                    }
                    accion = 3;
                }
                while (accion == 2) {
                    if (velocidadCaballo>=vb) {
                        System.out.println("Los has llevado a una trampa, BIEN HECHO !");
                    } else {
                        System.out.println("No puedes escapar, SU FUERZA ES MAYOR!!");
                    }
                    accion = 3;
                }

                System.out.println("Te has detenido...");
                System.out.println("Haz visto como es que solo corres en circulos...");
                System.out.println("Como es que en una carera avanzas sin avanzar");
                System.out.println("Piensas un poco");
                System.out.println("");
                System.out.println("ESTAS BAJO UN ATAQUE DE UN STAND ENEMIGO");
                System.out.println("");
                System.out.println("No conoces su poder, decide, RAPIDO !!!!");
                System.out.println("1: Atacar");
                System.out.println("2: Avanzar");
                Scanner readAccion2 = new Scanner(System.in);
                int accion2 = readAccion2.nextInt();

                Random readEcena = new Random();
                int ecenario;
                ecenario = readEcena.nextInt(2);

                if (ecenario == 1) {
                    System.out.println("El stand acabo contigo");
                } 
                if (ecenario == 2) {
                    System.out.println("Venciste al stand pero estas malherido");
                }

                mision1 = 90;
            }

        }
        if (character == 3) {
            System.out.println("");
            System.out.println("***Dio***");

            Random velocidad = new Random();
            int velocidadCaballo;
            velocidadCaballo = velocidad.nextInt(10);

            Random fuerza = new Random();
            int fuerzaCaballo;
            fuerzaCaballo = fuerza.nextInt(10);

            System.out.println("Velocidad: " + velocidadCaballo);
            System.out.println("Fuerza: " + fuerzaCaballo);

            System.out.println("Mision de Dio: 1 = start");
            Scanner m1 = new Scanner(System.in);
            int mision1 = m1.nextInt();

            while (mision1 == 1) {
                System.out.println("Estas compitiendo justo al lado del auto");
                System.out.println("Fuerza del auto: 6");
                int fb = 2;
                System.out.println("Velocidad del auto: 7");
                int vb = 2;
                System.out.println("--------------------------");
                System.out.println("Tu fuerza: " + fuerzaCaballo);
                System.out.println("Tu Velocidad: " + velocidadCaballo);
                System.out.println("Rango de tu Stand:");
                System.out.println("Poder destructivo del Stand: A");
                System.out.println("Velocidad del Stand: A");
                System.out.println("Rango del Stand: C");
                System.out.println("Durabilidad: A");
                System.out.println("Precision: B");
                System.out.println("Desarrollo: B");
                System.out.println("");
                System.out.println("1: Atacar");
                System.out.println("2: Avanzar");
                System.out.println("3: Deter el tiempo");
                System.out.println("4: Za wardo");
                Scanner readAccion = new Scanner(System.in);
                int accion = readAccion.nextInt();

                while (accion == 1) {
                    System.out.println("El auto ha sido destrozado");
                }
                while (accion == 2) {
                    System.out.println("Haz dejado atras al auto");
                }
                while (accion == 3) {
                    System.out.println("Za Wardo!! Deten el tiempo!!!!");
                    System.out.println("Haz golpeado al enemigo y con 9 segundos de ventaja haz cruzado la mientras el tiempo estaba detenido");
                }
                while (accion == 4) {
                    System.out.println("tu stand ha acabado con el enemigo");
                    accion = 10;
                }

                mision1 = 90;

            }

        }
        if (character == 4) {
            System.out.println("");
            System.out.println("***Crea Tu Personaje***");

            System.out.println("Ingrese un nombre");
            Scanner readName = new Scanner(System.in);
            String nombrePersonalizado = readName.nextLine();

            System.out.println("Ponga un numero de velocidad del 1 al 10");
            Scanner rapidez = new Scanner(System.in);
            int velocidadPersonalizada = rapidez.nextInt();

            System.out.println("Ponga un numero de fuerza del 1 al 10");
            Scanner poder = new Scanner(System.in);
            int poderPersonalizado = poder.nextInt();

            System.out.println("Nombre: " + nombrePersonalizado);
            System.out.println("Velocidad: " + velocidadPersonalizada);
            System.out.println("Fuerza: " + poderPersonalizado);

            System.out.println("Mision de: " + nombrePersonalizado + " 1 = Start");
            Scanner m1 = new Scanner(System.in);
            int mision1 = m1.nextInt();

            System.out.println("Cuantas millas se van a recorrer en la carrera:");
            Random carrera = new Random();
            int distanciaCarrera;
            distanciaCarrera = carrera.nextInt(450);
            System.out.println(distanciaCarrera);

            for (int i = 0; i < distanciaCarrera; i++) {
                System.out.println("Tu avanzas:");
                int perVelocidad = i + velocidadPersonalizada;
                System.out.println(perVelocidad);

                System.out.println("");

                System.out.println("El enemigo avanza:");
                Random avanceAuto = new Random();
                int avanzarA;
                avanzarA = avanceAuto.nextInt(10);
                int autVelocidad = i + avanzarA;
                System.out.println(autVelocidad);
            }
        }        
    }
}
