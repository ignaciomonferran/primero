import java.util.Scanner;

public class Acertijo {

    public static void acertijo () {
        System.out.println("ingresa un entero entre 1 y 10");
        Scanner sc = new Scanner(System.in);
        int response = Integer.valueOf(sc.nextLine());

        while(response != 7) {
            System.out.println("el numero es el incorrecto");
            response = Integer.valueOf(sc.nextLine());
        }


    }
}
