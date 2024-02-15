package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

/**
 * Interfaz que define las operaciones básicas para manipular contactos en un sistema.
 */
public interface ContactoDao {
    /**
     * Registra un nuevo contacto en el sistema.
     * @param contacto El contacto a dar de alta.
     * @return true si el contacto se dio de alta correctamente, false en caso contrario.
     */
    boolean altaContacto(Contacto contacto);

    /**
     * Elimina un contacto del sistema.
     * @param contacto El contacto a eliminar.
     * @return true si el contacto se eliminó correctamente, false en caso contrario.
     */
    boolean eliminarContacto(Contacto contacto);

    /**
     * Busca un contacto por su nombre.
     * @param nombre El nombre del contacto a buscar.
     * @return El contacto encontrado o null si no se encontró.
     */
    Contacto buscarUno(String nombre);


    /**
     * Busca un contacto por su número de teléfono.
     * @param telefono El número de teléfono del contacto a buscar.
     * @return El contacto encontrado o null si no se encontró.
     */
    Contacto buscarTelefono(String telefono);

    /**
     * Busca un contacto por su dirección de correo electrónico.
     * @param email El correo electrónico del contacto a buscar.
     * @return El contacto encontrado o null si no se encontró.
     */
    Contacto buscarEmail(String email);

    /**
     * Busca contactos cuyos nombres comiencen con los tres primeros caracteres especificados.
     * @param nombre Los tres primeros caracteres del nombre a buscar.
     * @return Una lista de contactos que coinciden con la búsqueda.
     */
    ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre);


    /**
     * Actualiza los datos de un contacto en el sistema.
     * @param contacto El contacto con los datos actualizados.
     * @return true si los datos del contacto se actualizaron correctamente, false en caso contrario.
     */
    boolean cambiarDatos(Contacto contacto);

    /**
     * Obtiene una lista de contactos que pertenecen a una empresa específica.
     * @param empresa El nombre de la empresa.
     * @return Una lista de contactos que pertenecen a la empresa especificada.
     */
    ArrayList<Contacto> contactosPorEmpresa(String empresa);

    /**
     * Exporta los contactos del sistema a un archivo especificado.
     * @param nombreFichero El nombre del archivo de destino.
     */
    void exportarContactos(String nombreFichero);


    /**
     * Importa contactos desde un archivo especificado al sistema.
     * @param nombreFichero El nombre del archivo de origen.
     */
    void importarContactos(String nombreFichero);
}
