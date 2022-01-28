public class Main {
    public static void main(String[] args) {

        Animal gato = new Animal();
        Animal tigre = new Animal();

        gato.animalID = 1;
        gato.especie = "Felino";
        gato.subEspecie = "Gato";

        tigre.animalID = 2;
        tigre.especie = "Felino";
        tigre.subEspecie = "Tigre";

        System.out.println("Hola soy un" + gato.subEspecie + " y soy de la especie " + gato.especie);
        System.out.println("Hola soy un" + tigre.subEspecie + " y soy de la especie " + tigre.especie);

        Acertijo.acertijo();
    }
}
