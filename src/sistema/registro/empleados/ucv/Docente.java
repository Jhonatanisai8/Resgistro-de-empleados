package sistema.registro.empleados.ucv;

public class Docente {

    private int codigo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String dedicacion;
    private int numHoras;
    private float costoHora;

    public Docente(int codigo, String nombre, String apellido, String direccion, String dedicacion, int numHoras, float costoHora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dedicacion = dedicacion;
        this.numHoras = numHoras;
        this.costoHora = costoHora;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public float getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(float costoHora) {
        this.costoHora = costoHora;
    }

    public float calcularSueldo() {
        if (this.dedicacion.equalsIgnoreCase("Tiempo Completo")) {
            return 3000;
        } else {
            return this.numHoras * this.costoHora;
        }
    }

    public String mostrarDatos() {
        String mensaje = "Codigo=" + codigo
                + "\nNombre=" + nombre
                + "\nApellido=" + apellido
                + "\nDireccion=" + direccion
                + "\nDedicacion=" + dedicacion
                + "\nNum Horas=" + numHoras
                + "\nCostoHora=" + costoHora;

        if (this.dedicacion.equalsIgnoreCase("Tiempo Completo")) {
            mensaje += "\nSueldo: " + calcularSueldo();
        } else {
            mensaje += "\nSuedo A tiempo Parcial: " + calcularSueldo() + "\n";
        }

        return mensaje;
    }

}
