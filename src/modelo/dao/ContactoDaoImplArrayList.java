package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

/**
 * Implementación de la interfaz ContactoDao que utiliza un ArrayList para almacenar los contactos en memoria.
 */
public class ContactoDaoImplArrayList implements ContactoDao {

    /**
     * Constructor que inicializa la lista de contactos y carga datos de ejemplo.
     */
    private ArrayList<Contacto> contactos;

    /**
     * Carga datos de ejemplo en la lista de contactos.
     */
    public ContactoDaoImplArrayList() {
        contactos = new ArrayList<>();
        cargardatos();
    }

    /**
     * Carga datos de ejemplo en la lista de contactos.
     */
    private void cargardatos() {
        contactos.add(new Contacto("Deivi", "Perdomo", "644526468", "deivi@gmail.com","Jaztel"));
        contactos.add(new Contacto("Paco", "Ramirez", "644511168", "paco@gmail.com","Etecsa"));
        contactos.add(new Contacto("Jose", "Perez", "609326468", "jose@gmail.com","Vodafone"));
    }

    /**
     * Obtiene todos los contactos almacenados.
     * @return La lista de todos los contactos.
     */
    public ArrayList<Contacto> buscarTodos() {
        return contactos;
    }

    @Override
    public boolean altaContacto(Contacto contacto) {
        if (!contactos.contains(contacto)) {
            contactos.add(contacto);
            return true;
        }else
            return false;
    }

    @Override
    public boolean eliminarContacto(Contacto contacto) {
        return contactos.remove(contacto);
    }

    @Override
    public Contacto buscarUno(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    @Override
    public Contacto buscarTelefono(String telefono) {
        int posEncontrada= -1;
        //creamos un for para recorrer array
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getTelefono()==telefono) {
                posEncontrada=i;
                break;
            }
        }
        if (posEncontrada == -1) {
            return null;
        }else {

            return contactos.get(posEncontrada);

        }
    }

    @Override
    public Contacto buscarEmail(String email) {
        int posEncontrada= -1;
        //creamos un for para recorrer array
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getEmail()==email) {
                posEncontrada=i;
                break;
            }
        }
        if (posEncontrada == -1) {
            return null;
        }else {
            return contactos.get(posEncontrada);

        }
    }
    @Override
    public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) {
        ArrayList<Contacto> contactosEncontrados = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().startsWith(nombre.substring(0, 3))) {
                contactosEncontrados.add(contacto);
            }
        }
        return contactosEncontrados;
    }

    @Override
    public boolean cambiarDatos(Contacto contacto) {
        int index = contactos.indexOf(contacto);
        if (index != -1) {
            contactos.set(index, contacto);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Contacto> contactosPorEmpresa(String empresa) {
        ArrayList<Contacto> contactosEmpresa = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto.getEmpresa().equalsIgnoreCase(empresa)) {
                contactosEmpresa.add(contacto);
            }
        }
        return contactosEmpresa;
    }

    @Override
    public void exportarContactos(String nombreFichero) {
        // TODO Auto-generated method stub

    }

    @Override
    public void importarContactos(String nombreFichero) {
        // TODO Auto-generated method stub

    }

}
