public class Animal {
    private String especie;
    private String name;
    private String edad;

    public Animal() {
    }

    public Animal(String especie, String name, String edad) {
        this.especie = especie;
        this.name = name;
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String sonido(){
        return null;
    }
}
