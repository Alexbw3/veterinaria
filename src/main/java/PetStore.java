public class PetStore {
    public static void main(String[] args) {
        CatStore mascotas = new CatStore("Botas","Gato", "2 años");

        mascotas.toString();
        System.out.println("----SONIDO DE LA MASCOTA----");
        System.out.println(mascotas.sonido());

        System.out.println("............................................................");

        DogStore mascota2= new DogStore("Perro","Lukas","1 años");

        mascota2.toString();
        System.out.println("----SONIDO DE LA MASCOTA----");
        System.out.println(mascota2.sonido());


    }
}
