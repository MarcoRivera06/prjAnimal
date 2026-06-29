package animal.mamifero;

public class Caballo extends Mamifero {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Caballo (String n){
        this.setNombre(n);
    }
    
}
