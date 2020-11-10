package Dominio;

import java.io.Serializable;

public class ReciboIndependiente implements Serializable{

    private String nombre;
    private int sueldo;
    private int IRPF;
    private int IVA;

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

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int unIVA) {
        this.IVA = unIVA;
    }

    public ReciboIndependiente() {
        this.setNombre("Sin nombre");
        this.setSueldo(0);
        this.setIRPF(0);
        this.setIVA(0);
    }

    public ReciboIndependiente(String unNombre, int unSueldo, int unIRPF, int unIVA) {
        this.setNombre(unNombre);
        this.setSueldo(unSueldo);
        this.setIRPF(unIRPF);
        this.setIVA(unIVA);
    }

    @Override
    public String toString() {
        return "Nombre del recibo dependiente: " + this.getNombre()
                + "Monto total: " + this.getSueldo()
                + "IRPF: " + this.getIRPF()
                + "IVA: " + this.getIVA();
    }
}
