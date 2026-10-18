public class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;
    private static int totalAplicaciones = 0;

    public Aplicacion(String nombre, String version) {

        totalAplicaciones++;

        this.id = totalAplicaciones;

        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }

        if (version != null && !version.trim().isEmpty()){
            this.version = version;
        }

        this.ejecutando = true;
    }

    public static int ElTotalAplicaciones(){
        return totalAplicaciones;
    }

    public String getNombre(){
        return nombre;
    }

    public String getVersion(){
        return version;
    }

    public void iniciar(){
        ejecutando = true;
    }

    public void cerrar(){
        ejecutando = false;
    }

}
