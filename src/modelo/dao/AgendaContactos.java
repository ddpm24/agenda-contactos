package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

public class AgendaContactos {
    private String nombreAgenda;
    private ArrayList<Contacto> lista;

    public AgendaContactos(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }

    public AgendaContactos(String nombreAgenda, ArrayList<Contacto> lista) {
        this.nombreAgenda = nombreAgenda;
        this.lista = lista;
    }

    public String getNombreAgenda() {
        return nombreAgenda;
    }

    public void setNombreAgenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }

    public ArrayList<Contacto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Contacto> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "AgendaContactos{" +
                "nombreAgenda='" + nombreAgenda + '\'' +
                ", lista=" + lista +
                '}';
    }



}
