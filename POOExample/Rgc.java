public class Rgc
{
    // ATRIBUTOS
    private String nombre;
    private String appPat;
    private String appMat;
    private int dd;
    private int mm;
    private int aa;

    private String rfc;

    // MÉTODOS
    // GETTERS Y SETTERS
    
    // Es posible ir generando la documentación
    // usando los comentarios de varias líneas
    // y algunas palabras clave, por ejemplo:
    // @param, para los parámetros de una función
    // @return para el valor que regresa una función
    /**
     * @return String regresa el atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre para modificar atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the appPat
     */
    public String getAppPat() {
        return appPat;
    }

    /**
     * @param appPat para modificar atributo appPat
     */
    public void setAppPat(String appPat) {
        this.appPat = appPat;
    }

    /**
     * @return String return the appMat
     */
    public String getAppMat() {
        return appMat;
    }

    /**
     * @param appMat para modificar atributo appMat
     */
    public void setAppMat(String appMat) {
        this.appMat = appMat;
    }

    /**
     * @return int return the dd
     */
    public int getDd() {
        return dd;
    }

    /**
     * @param dd para modificar atributo dd
     */
    public void setDd(int dd) {
        this.dd = dd;
    }

    /**
     * @return int return the mm
     */
    public int getMm() {
        return mm;
    }

    /**
     * @param mm para modificar atributo mm
     */
    public void setMm(int mm) {
        this.mm = mm;
    }

    /**
     * @return int return the aa
     */
    public int getAa() {
        return aa;
    }

    /**
     * @param aa para modificar atributo aa
     */
    public void setAa(int aa) {
        this.aa = aa;
    }

    /**
     * Constructor de la clase Rgc
     * <p>Recibe los parámetros para crear un objeto Rgc
     * 
     * @param String nombre
     * @param String appPat 
     * @param String appMat
     * @param Int dd 
     * @param Int mm 
     * @param Int aa
     */
    public Rgc(String nombre, String appPat, String appMat, int dd, int mm, int aa) {
        this.nombre = nombre;
        this.appPat = appPat;
        this.appMat = appMat;
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }

    // MÉTODOS
    /**
     * Calcula el RFC con los atributos de la clase
     * 
     * @return String rgc
     */
    public String calcularRGC()
    {
        // Generar una variable local
        String rgc;
        rgc = this.appPat.substring(0, 2);
        rgc += this.appMat.charAt(0);
        rgc += this.nombre.charAt(0);
        rgc = rgc.toUpperCase();
        rgc += String.valueOf(this.aa).substring(2, 4);
        
        if(String.valueOf(this.mm).length() < 2) 
            rgc += "0";
        //rgc += (String.valueOf(this.mm).length() < 2)? "0" + String.valueOf(this.mm):String.valueOf(this.mm);
        rgc += String.valueOf(this.mm);
        if(String.valueOf(this.dd).length() < 2)
            rgc += "0";
        rgc += String.valueOf(this.dd);

        this.rfc = rgc;

        return rgc;
    }

    public void mostrarRFC()
    {
        System.out.println("El RFC es: " + this.rfc);
    }
}