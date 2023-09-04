public class Auto {
    // ATRIBUTOS
    // Todo lo que describe al objeto
    // Se encuentran ocultos a la vista de
    // los programadores mediante la palabra
    // clave "private", a esto se le llama
    // encapsulamiento
    private String color;
    private String marca;
    private int modelo;
    private float peso;
    private String combustible;    

    /* 
     * Getters y setters de los atributos 
     * Se trata de métodos que permiten tener
     * acceso a los atributos que están
     * encapsulados
    */
    // Lectura
    public String getColor() {
        return color;
    }
    // Escritura
    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    // MÉTODOS
    // Constructor
    // Genera o construye el objeto
    // (Asigna espacio en memoria al objeto)
    public Auto()
    {
        // Generalmente se usa para asignar
        // valores por omisión
        color = "Rojo";
        marca = "Reanult";
        modelo = 1990;
        peso = 1500;
        combustible = "hidrógeno";
    }
    // Sin embargo, mediante un mecanismo conocido
    // como polimorfismo, se puede hacer que una misma
    // función tenga diferentes comportamientos, en este caso
    // Este constructor, recibe 5 parámetros que se asignarán
    // a los atributos del objeto a crear
    public Auto(String color, String marca, int modelo, float peso, String combustible)
    {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.combustible = combustible;
    }
    // Este constructor solamente recibe un solo
    // argumento, en este caso marca
    public Auto(String marca)
    {
        this.marca = marca;
    }

    // Método mostrar(sela)
    public void mostrarAuto()
    {
        System.out.println("Mi coche es " + marca + " y color " + color);
    }
}
