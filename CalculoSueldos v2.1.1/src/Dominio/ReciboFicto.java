package Dominio;

import java.io.Serializable;

public class ReciboFicto implements Serializable{

    private String nombre;
    private int sueldo;
    private int IRPF;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int unSueldo) {
        this.sueldo = unSueldo;
    }

    public int getIRPF() {
        return IRPF;
    }

    public void setIRPF(int unIRPF) {
        this.IRPF = unIRPF;
    }

    public ReciboFicto() {
        this.setNombre("Sin nombre");
        this.setSueldo(0);
        this.setIRPF(0);
    }

    public ReciboFicto(String unNombre, int unSueldo, int unIRPF) {
        this.setNombre(unNombre);
        this.setSueldo(unSueldo);
        this.setIRPF(unIRPF);
    }

}
