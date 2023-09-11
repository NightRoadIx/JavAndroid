public abstract class Figura
{
    // ATRIBUTOS
    private int color;

    // MÉTODOS
    // Constructor
    public Figura(int color)
    {
        this.color = color;
    }
    // Modifica el color (Dr. Simi setter)
    public void cambiarColor(int color)
    {
        this.color = color;
    }
    // Método borrar figura (abstracto)
    public abstract void borrar();
    // Método dibujar figura (abstracto)
    public abstract void dibujar();
}