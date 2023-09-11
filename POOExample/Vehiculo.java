public class Vehiculo 
{
    // ATRIBUTOS
    private float ancho;
    private float alto;
    private float largo;
    private String color;
    private String combustible;
    private int numAsientos;

    // MÉTODOS

    /**
     * @return float return the ancho
     */
    public float getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    /**
     * @return float return the alto
     */
    public float getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(float alto) {
        this.alto = alto;
    }

    /**
     * @return float return the largo
     */
    public float getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(float largo) {
        this.largo = largo;
    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return String return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * @return int return the numAsientos
     */
    public int getNumAsientos() {
        return numAsientos;
    }

    /**
     * @param numAsientos the numAsientos to set
     */
    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    // CONSTRUCTOR
    public Vehiculo()
    {
        System.out.println("Se creo un Vehículo");
    }

    public void mover()
    {
        System.out.println("Se movió el vehículo");
    }
}
