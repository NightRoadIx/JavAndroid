import java.util.Scanner;

public class Esepsion {
    
    // ATRIBUTOS
    private int x;
    private int y;
    private int res;

    // MÉTODOS
    /**
     * @return int return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return int return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return int return the res
     */
    public int getRes() {
        return res;
    }

    /**
     * @param res the res to set
     */
    public void setRes(int res) {
        this.res = res;
    }

    public Esepsion()
    {
        this.x = 0;
        this.y = 0;
        this.res = 0;
    }

    public void recibir()
    {
        Scanner entra = new Scanner(System.in);
        System.out.println("Ingrese x: ");
        int tmpx = entra.nextInt();
        System.out.println("Ingrese y: ");
        int tmpy = entra.nextInt();
        this.x = tmpx;
        this.y = tmpy;
        entra.close();
    }

    public int operar()
    {
        // Controlar la excepción
        try
        {
            // Esta operación genera una excepción
            // cuando el valor del atributo "y"
            // es igual a cero
            this.res = this.x / this.y;
        }
        catch(ArithmeticException e) // Se controla la excepción de tipo aritmética
        {
            // Esta exepción se guarda en un objeto de clase ArithmeticException

            // Mandar un mensaje de error al usuario
            // Se incluye el objeto excepción
            System.out.println("Error de división entre 0.\n" + e);
            // Asignar el valor de respuesta a cero para evitar errores
            this.res = 0;
        }
        catch(Exception e) // Capturar un error genérico
        {
            System.out.println("Error " + e);
            // Asignar el valor de respuesta a cero para evitar errores
            this.res = 0;
        }
        finally
        {
            // Esto se ejecuta siempre, exista o no la excepción
            System.out.println("Operación realizada en " + this.getClass());
            // this.getClass(), devuelve el nombre de la clase
        }
        return this.res;
    }

}
