// Nombre de la clase
public class prueba 
{
    // Función MAIN (desde aquí corre)
    public static void main(String[] args) 
    {
        /* 
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

        Rgc elProfe = new Rgc("Luis Gelipe de Jebús",
        "Hernández", "Quintanar", 1, 2, 1980);

        System.out.println("El RFC es: " + elProfe.calcularRGC());
        */        
        Vehiculo ovni = new Vehiculo();
        Terrestre ferrari = new Terrestre();

        ovni.mover();
        ferrari.mover();

        System.out.println(ferrari.toString());

        // No pueden instanciar clases abstractas
        // solamente sus chamacas
        Figura1D guaterfoc = new Figura1D(4);

        /* Instancia un objeto que trae exepciones controladas */
        Esepsion nueva = new Esepsion();
        nueva.recibir();
        System.out.println(nueva.operar());

    }
}