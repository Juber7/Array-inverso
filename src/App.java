import java.util.Scanner;

public class App {

    public static int[] arreglo;
    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condicionSalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condicionSalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrió algo, revisar");
                leer.nextLine();
            }

        } while (condicionSalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);
        MostrarI(array);

    }

    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valor [" + (i+1) + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }

        //Hay que hacer que mire bonito
        System.out.println("------array inverso------");
    }

    //Aqui va el metodo de inverso
    public static void MostrarI(int[] b){
    for (int j = b.length - 1; j >= 0 ; j--) {
        System.out.println(b[j]);
    }
    }
    //los voy a apalzar a todos
    // a laa, ni que lo invitemos al cholo?
}


