public class Terrestre extends Vehiculo
{
    /* ATRIBUTOS */
    private int numejes;
    private String traccion;

    /* MÉTODOS */
    /**
     * @return int return the numejes
     */
    public int getNumejes() {
        return numejes;
    }

    /**
     * @param numejes the numejes to set
     */
    public void setNumejes(int numejes) {
        this.numejes = numejes;
    }

    /**
     * @return String return the traccion
     */
    public String getTraccion() {
        return traccion;
    }

    /**
     * @param traccion the traccion to set
     */
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    // Constructor
    public Terrestre()
    {
        // super();  // Llamar a constructor de la clase Padre
        System.out.println("Se crea uno terrestre");
    }

}
