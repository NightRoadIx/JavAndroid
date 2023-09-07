public class Aereo extends Vehiculo
{
    /* ATRIBUTOS */
    private int numAlas;
    
    /* MÉTODOS */
    /**
     * @return int return the numAlas
     */
    public int getNumAlas() {
        return numAlas;
    }

    /**
     * @param numAlas the numAlas to set
     */
    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }

    public Aereo()
    {
        System.out.println("Se genera un aéreo");
    }

    public void despegar()
    {
        System.out.println("Despegó");
    }
}
