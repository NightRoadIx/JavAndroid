// Nombre de la clase

import java.util.ArrayList;
import java.util.Arrays;

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
        /*      
        Vehiculo ovni = new Vehiculo();
        Terrestre ferrari = new Terrestre();

        ovni.mover();
        ferrari.mover();

        System.out.println(ferrari.toString());

        // No pueden instanciar clases abstractas
        // solamente sus chamacas
        Figura1D guaterfoc = new Figura1D(4);
         */
        /* Instancia un objeto que trae exepciones controladas */
        //Esepsion nueva = new Esepsion();
        //nueva.recibir();
        //System.out.println(nueva.operar());

        // Arreglos
        // Al igual que en lenguaje C, se realiza
        // tipo_dato[] variable;
        int[] fibo = {0, 1, 1, 2, 3, 5};
        // Se recorren como en lenguaje C
        for(int i = 0; i < 6; i++)
            System.out.println(fibo[i]);
        
        // Sin embargo, hay una estructura que
        // permite recorrer los arreglos (de ahora en adelante
        // Colecciones) de la siguiente forma:
        // for(tipo_dato tmp : Coleccion)
        for(int fib : fibo)
            System.out.println(fib);

        // Usando la clase Arrays, es posible mostrar
        // el arreglo usando el método toString()
        System.out.println(Arrays.toString(fibo));

        // Por otro lado, existe una forma de generar
        // colecciones de datos con métodos para añadir
        // insertar, actualizar o eliminar datos
        // Una de ellas es la clase ArrayList
        // que mediante los envoltorios se puede determinar
        // que tipo de datos es el que contendrá
        // Se instancian como:
        // ArrayList<tipo_dato> objeto = new ArrayList<tipo_dato>();
        ArrayList<Integer> fibo2 = new ArrayList<Integer>();

        // Añadir datos a la lista
        fibo2.add(0);
        fibo2.add(1);

        // Recorrer la colección
        for(int fib : fibo2)
            System.out.println(fib);

    }
}
