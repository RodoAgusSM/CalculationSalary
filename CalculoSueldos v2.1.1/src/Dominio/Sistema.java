package Dominio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Sistema implements Serializable {

    private ArrayList<ReciboDependiente> listaRecibosDependientes;
    private ArrayList<ReciboIndependiente> listaRecibosIndependientes;
    private ArrayList<ReciboFicto> listaRecibosFictos;

    public Sistema() {
        listaRecibosDependientes = new ArrayList<ReciboDependiente>();
        listaRecibosIndependientes = new ArrayList<ReciboIndependiente>();
        listaRecibosFictos = new ArrayList<ReciboFicto>();
    }

    public ArrayList<ReciboDependiente> getListaRecibosDependientes() {
        return listaRecibosDependientes;
    }

    public void agregarReciboDependiente(ReciboDependiente unReciboDependiente) {
        listaRecibosDependientes.add(unReciboDependiente);
    }

    public ArrayList<ReciboIndependiente> getListaRecibosIndependientes() {
        return listaRecibosIndependientes;
    }

    public void agregarReciboIndependiente(ReciboIndependiente unReciboIndependiente) {
        listaRecibosIndependientes.add(unReciboIndependiente);
    }

    public ArrayList<ReciboFicto> getListaRecibosFictos() {
        return listaRecibosFictos;
    }

    public void agregarReciboFicto(ReciboFicto unReciboFicto) {
        listaRecibosFictos.add(unReciboFicto);
    }

    public boolean ingresarReciboDependiente(String unNombre, int unSueldo, int unIRPF, int unMontepio, int unFonasa1, int unFonasa2, int unFonasa3, int unFonasa4, int FRL) {
        ReciboDependiente unReciboD = new ReciboDependiente(unNombre, unSueldo, unIRPF, unMontepio, unFonasa1, unFonasa2, unFonasa3, unFonasa4, FRL);
        if (!existeReciboDependiente(unNombre)) {
            agregarReciboDependiente(unReciboD);
            return true;
        }
        return false;
    }

    public boolean ingresarReciboIndependiente(String unNombre, int unSueldo, int unIRPF, int unIVA) {
        ReciboIndependiente unReciboI = new ReciboIndependiente(unNombre, unSueldo, unIRPF, unIVA);
        if (!existeReciboIndependiente(unNombre)) {
            agregarReciboIndependiente(unReciboI);
            return true;
        }
        return false;
    }

    public boolean ingresarReciboFicto(String unNombre, int unSueldo, int unIRPF) {
        ReciboFicto unReciboF = new ReciboFicto(unNombre, unSueldo, unIRPF);
        if (!existeReciboFicto(unNombre)) {
            agregarReciboFicto(unReciboF);
            return true;
        }
        return false;
    }

    public boolean borrarReciboDependiente(String unNombre) {
        for (int i = 0; i < this.getListaRecibosDependientes().size(); i++) {
            ReciboDependiente rD = this.getListaRecibosDependientes().get(i);
            if (rD.getNombre().toUpperCase().equals(unNombre.toUpperCase())) {
                this.getListaRecibosDependientes().remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean borrarReciboIndependiente(String unNombre) {
        for (int i = 0; i < this.getListaRecibosIndependientes().size(); i++) {
            ReciboIndependiente rI = this.getListaRecibosIndependientes().get(i);
            if (rI.getNombre().toUpperCase().equals(unNombre.toUpperCase())) {
                this.getListaRecibosIndependientes().remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean borrarReciboFicto(String unNombre) {
        for (int i = 0; i < this.getListaRecibosFictos().size(); i++) {
            ReciboFicto rF = this.getListaRecibosFictos().get(i);
            if (rF.getNombre().toUpperCase().equals(unNombre.toUpperCase())) {
                this.getListaRecibosFictos().remove(i);
                return true;
            }
        }
        return false;
    }
    
     public boolean existeReciboDependiente(String unNombre) {
        for (int i = 0; i < this.getListaRecibosDependientes().size(); i++) {
            ReciboDependiente rD = this.getListaRecibosDependientes().get(i);
            if (rD.getNombre().toUpperCase().equals(unNombre.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean existeReciboIndependiente(String unNombre) {
        for (int i = 0; i < this.getListaRecibosIndependientes().size(); i++) {
            ReciboIndependiente rI = this.getListaRecibosIndependientes().get(i);
            if (rI.getNombre().toUpperCase().equals(unNombre.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean existeReciboFicto(String unNombre) {
        for (int i = 0; i < this.getListaRecibosFictos().size(); i++) {
            ReciboFicto rF = this.getListaRecibosFictos().get(i);
            if (rF.getNombre().toUpperCase().equals(unNombre.toUpperCase())) {
                this.getListaRecibosFictos().remove(i);
                return true;
            }
        }
        return false;
    }

     public void guardarSistema(Sistema sis,String nombre) throws FileNotFoundException, IOException {
        try {
            File aqui = new File("").getAbsoluteFile();
            String direccionEntera = aqui.getPath() + "\\" + nombre;
            BufferedOutputStream outBuffer = new BufferedOutputStream(new FileOutputStream(direccionEntera));
            ObjectOutputStream stream = new ObjectOutputStream(outBuffer);
            stream.writeObject(sis);
            stream.flush();
            stream.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
    
    public Sistema obtenerSistema(String nombre) {
        Sistema sis = null;
        try {
            File aqui = new File("").getAbsoluteFile();
            String direccionEntera = aqui.getPath() + "\\" + nombre;
            BufferedInputStream inBuffer = new BufferedInputStream(new FileInputStream(direccionEntera));
            ObjectInputStream stream = new ObjectInputStream(inBuffer);
            sis = (Sistema) stream.readObject();
            stream.close();
        } catch (Exception err) {
            sis = new Sistema();
        }
        return sis;
    }
}
