package Dominio;

import java.io.Serializable;

public class ReciboDependiente implements Serializable{

    private String nombre;
    private int sueldo;
    private int IRPF;
    private int montepio;
    private int fonasa1;
    private int fonasa2;
    private int fonasa3;
    private int fonasa4;
    private int FRL;

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

    public int getMontepio() {
        return montepio;
    }

    public void setMontepio(int unMontepio) {
        this.montepio = unMontepio;
    }

    public int getFonasa1() {
        return fonasa1;
    }

    public void setFonasa1(int unFonasa1) {
        this.fonasa1 = unFonasa1;
    }

    public int getFonasa2() {
        return fonasa2;
    }

    public void setFonasa2(int unFonasa2) {
        this.fonasa2 = unFonasa2;
    }

    public int getFonasa3() {
        return fonasa3;
    }

    public void setFonasa3(int unFonasa3) {
        this.fonasa3 = unFonasa3;
    }

    public int getFonasa4() {
        return fonasa4;
    }

    public void setFonasa4(int unFonasa4) {
        this.fonasa4 = unFonasa4;
    }

    public int getFRL() {
        return FRL;
    }

    public void setFRL(int unFRL) {
        this.FRL = unFRL;
    }

    public ReciboDependiente() {
        this.setNombre("Sin nombre");
        this.setSueldo(0);
        this.setIRPF(0);
        this.setMontepio(0);
        this.setFonasa1(0);
        this.setFonasa2(0);
        this.setFonasa3(0);
        this.setFonasa4(0);
        this.setFRL(0);
    }

    public ReciboDependiente(String unNombre, int unSueldo, int unIRPF, int unMontepio, int unFonasa1, int unFonasa2, int unFonasa3, int unFonasa4, int unFRL) {
        this.setNombre(unNombre);
        this.setSueldo(unSueldo);
        this.setIRPF(unIRPF);
        this.setMontepio(unMontepio);
        this.setFonasa1(unFonasa1);
        this.setFonasa2(unFonasa2);
        this.setFonasa3(unFonasa3);
        this.setFonasa4(unFonasa4);
        this.setFRL(unFRL);
    }
}
