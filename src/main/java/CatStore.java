public class CatStore extends Animal {
    public CatStore (String especie, String name, String edad){
        super(name,especie, edad);
    }
    public String sonido(){
        return "miau,miau";
    }

    public String toString() {
        System.out.println("nombre de la mascota:"+getName());
        System.out.println("tipo de especie: "+getEspecie());
        System.out.println("edad:"+getEdad());
        return "";
    }

}
