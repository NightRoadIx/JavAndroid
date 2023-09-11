public class Figura1D extends Figura
{
    // ATRIBUTOS

    // MÉTODOS
    public Figura1D(int color)
    {
        // Llamar al constructor padre y enviarle
        // un parámetro
        super(color);  
    }

    // Redefinir métodos abstractos
    @Override
    public void dibujar()
    {
        System.out.println("Dibuje algo bonito =D");
    }
}
