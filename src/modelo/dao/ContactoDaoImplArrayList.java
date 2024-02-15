package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

public class ContactoDaoImplArrayList implements ContactoDao {

    private ArrayList<Contacto> contactos;

    public ContactoDaoImplArrayList() {

        contactos = new ArrayList<>();
        cargardatos();
    }

    private void cargardatos() {
        contactos.add(new Contacto("Deivi", "Perdomo", "644526468", "deivi@gmail.com","Jaztel"));
        contactos.add(new Contacto("Paco", "Ramirez", "644511168", "paco@gmail.com","Etecsa"));
        contactos.add(new Contacto("Jose", "Perez", "609326468", "jose@gmail.com","Vodafone"));
    }


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
        for (Contacto contacto : contactos) {
            if (contacto.getTelefono().equals(telefono)) {
                return contacto;
            }
        }
        return null;
    }

    @Override
    public Contacto buscarEmail(String email) {
        for (Contacto contacto : contactos) {
            if (contacto.getEmail().equalsIgnoreCase(email)) {
                return contacto;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) {
        ArrayList<Contacto> contactosEncontrados = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().toLowerCase().startsWith(nombre.toLowerCase().substring(0, 3))) {
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
