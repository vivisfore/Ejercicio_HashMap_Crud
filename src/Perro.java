public class Perro {

    private String raza;
    private String nombre;
    private String color;
    private int edad;
    private float altura;
    private String tamanio;

    public Perro() {
    }

    public Perro(String raza, String nombre, String color, int edad, float altura, String tamanio) {
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.altura = altura;
        this.tamanio = tamanio;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" +'\n' +
                "raza='" + raza + '\n' +
                ", nombre='" + nombre + '\n' +
                ", color='" + color + '\n' +
                ", edad=" + edad +'\n' +
                ", altura=" + altura +'\n' +
                ", tamanio='" + tamanio + '\n' +
                '}';
    }
}
