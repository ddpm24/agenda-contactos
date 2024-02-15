package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

/**
 * Clase que representa una agenda de contactos.
 */
public class AgendaContactos {
    private String nombreAgenda;
    private ArrayList<Contacto> lista;

    /**
     * Constructor que inicializa una agenda de contactos con el nombre especificado.
     * @param nombreAgenda El nombre de la agenda de contactos.
     */
    public AgendaContactos(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }

    /**
     * Constructor que inicializa una agenda de contactos con el nombre y la lista de contactos especificados.
     * @param nombreAgenda El nombre de la agenda de contactos.
     * @param lista La lista de contactos.
     */
    public AgendaContactos(String nombreAgenda, ArrayList<Contacto> lista) {
        this.nombreAgenda = nombreAgenda;
        this.lista = lista;
    }

    /**
     * Obtiene el nombre de la agenda de contactos.
     * @return El nombre de la agenda de contactos.
     */
    public String getNombreAgenda() {
        return nombreAgenda;
    }

    /**
     * Establece el nombre de la agenda de contactos.
     * @param nombreAgenda El nombre de la agenda de contactos.
     */
    public void setNombreAgenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }

    /**
     * Obtiene la lista de contactos.
     * @return La lista de contactos.
     */
    public ArrayList<Contacto> getLista() {
        return lista;
    }

    /**
     * Establece la lista de contactos.
     * @param lista La lista de contactos.
     */
    public void setLista(ArrayList<Contacto> lista) {
        this.lista = lista;
    }

    /**
     * Devuelve una representación de cadena de la agenda de contactos.
     * @return Representación de cadena de la agenda de contactos.
     */
    @Override
    public String toString() {
        return "AgendaContactos{" +
                "nombreAgenda='" + nombreAgenda + '\'' +
                ", lista=" + lista +
                '}';
    }
}
