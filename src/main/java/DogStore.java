public class DogStore extends Animal{
    public DogStore (String name, String especie, String edad){
        super(name,especie,edad);
    }

    public String sonido (){
        return"huhuahua";
    }

    public String toString() {
        System.out.println("name:"+getName());
        System.out.println("especie:"+getEspecie());
        System.out.println("edad:"+getEdad());
        return "";
    }

}
