import java.util.Objects;

public class Personas {
    private String nombre;
    private int edad;

    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "nombre='" + nombre + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false; //uno de los dos es null  y cuando sea diferentes
        Personas personas = (Personas) o;
        return edad == personas.edad && Objects.equals(nombre, personas.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
