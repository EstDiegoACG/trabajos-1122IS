public class App {
    public static void main(String[] args) throws Exception {

        int noOrder[] = {1,4,2,10,15,18,3,4,20};
        //int yesOrder[] = new int[9];
        //imprimir el numero solo si es igual a alguno del que sigue

        for (int i = 0; i < 50; i++) {      
            for (int j = 0; j < 9; j++) {

                //whith if we comparamos if the araay es igual al numero del for
                if (i == noOrder[j]) {
                    System.out.println(noOrder[j]);
                    //And print
                }

            }
        }
    }
}