// Nombre de la clase
public class prueba 
{
    // Función MAIN (desde aquí corre)
    public static void main(String[] args) 
    {
        // Instanciar un objeto
        // Clase objeto = new Constructor()
        Auto automovil = new Auto();
        Auto andres = new Auto("Naranja huevo", "Suzuki Swift", 2022, 1100, "Mild Hybrid");
        Auto leon = new Auto();
        Auto padriurix = new Auto("Ford");

        String coffee = new String("Heil Keidi");
        System.out.println(coffee.charAt(3));

        // Cambiar atributos de clase
        // NOTA: Esto es incorrecto
        // los atributos NO pueden modificarse
        // fuera de la clase
        automovil.setColor("Rosa Barbie");
        automovil.setMarca("Toyota");
        leon.setMarca("Mercedes");

        // Mandar a llamar el método de clase
        automovil.mostrarAuto();
        leon.mostrarAuto();
        andres.mostrarAuto();
        padriurix.mostrarAuto();

        System.out.println(automovil.getColor());
    }
}