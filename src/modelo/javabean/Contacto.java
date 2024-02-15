package modelo.javabean;

import java.util.Objects;

/**
 *  Clase que representa un contacto con información básica.
 */
public class Contacto {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String empresa;

    /**
     * Constructor que inicializa un contacto con el nombre especificado.
     * @param nombre El nombre del contacto.
     */
    public Contacto(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa un contacto con la información especificada.
     * @param nombre El nombre del contacto.
     * @param apellidos Los apellidos del contacto.
     * @param telefono El número de teléfono del contacto.
     * @param email El correo electrónico del contacto.
     * @param empresa La empresa a la que pertenece el contacto.
     */
    public Contacto(String nombre, String apellidos, String telefono, String email, String empresa) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.empresa = empresa;
    }

    /**
     * Obtiene el nombre del contacto.
     * @return El nombre del contacto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del contacto.
     * @param nombre El nombre del contacto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos del contacto.
     * @return Los apellidos del contacto.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del contacto.
     * @param apellidos Los apellidos del contacto.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene el número de teléfono del contacto.
     * @return El número de teléfono del contacto.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del contacto.
     * @param telefono El número de teléfono del contacto.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el correo electrónico del contacto.
     * @return El correo electrónico del contacto.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del contacto.
     * @param email El correo electrónico del contacto.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la empresa a la que pertenece el contacto.
     * @return La empresa a la que pertenece el contacto.
     */
    public String getEmpresa() {
        return empresa;
    }


    /**
     * Establece la empresa a la que pertenece el contacto.
     * @param empresa La empresa a la que pertenece el contacto.
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    /**
     * Devuelve una representación de cadena del contacto.
     * @return Representación de cadena del contacto.
     */
    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }

    /**
     * Comprueba si este contacto es igual a otro objeto.
     * @param o El objeto con el que se va a comparar.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }


    /**
     * Devuelve el código hash del contacto.
     * @return El código hash del contacto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
