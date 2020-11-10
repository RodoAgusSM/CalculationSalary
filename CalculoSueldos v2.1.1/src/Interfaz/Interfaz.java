package Interfaz;

import java.util.*;
import Dominio.*;

public class Interfaz {

    private Sistema sistema;

    public Sistema getSistema() {
        return sistema;
    }

    public void setModelo(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public Interfaz(Sistema unSistema) {
        this.setModelo(unSistema);
    }

    public int ingresarNroUnVal(String unTexto, String unError, int valorMin) {
        Scanner in = new Scanner(System.in);
        boolean ok = false;
        int nroUnVal = 0;
        System.out.print(unTexto);
        while (!ok) {
            try {
                nroUnVal = in.nextInt();
                if (nroUnVal < valorMin) {
                    System.out.println(unError);
                } else {
                    ok = true;
                }
            } catch (InputMismatchException e) {
                System.out.print("Error, reingrese por favor :");
                nroUnVal = 0;
                in.next();
            }
        }
        return nroUnVal;
    }

    public int ingresarNroDosVal(String unTexto, String unError, int valorMin, int valorMax) {
        Scanner in = new Scanner(System.in);
        int nroDosVal = 0;
        boolean ok = false;
        System.out.print(unTexto);
        while (!ok) {
            try {
                nroDosVal = in.nextInt();
                if (nroDosVal < valorMin || nroDosVal > valorMax) {
                    System.out.println(unError);

                } else {
                    ok = true;
                }
            } catch (InputMismatchException e) {
                System.out.print("Error, reingrese por favor: ");
                nroDosVal = 0;
                in.next();
            }
        }
        return nroDosVal;
    }

    public String ingresarTexto(String mensaje) {
        Scanner in = new Scanner(System.in);
        String texto = "";
        System.out.print(mensaje);
        texto = in.nextLine();
        while (texto.trim().equals("")) {
            System.out.print("Ingresar un texto sin espacios vacíos: ");
            texto = in.nextLine();
        }
        return texto;
    }

    public String error() {
        String texto = "ERROR REINGRESE, POR FAVOR";
        return texto;
    }

    public void menuPrincipal() {
        int opcion = 0;
        while (opcion != 11) {
            System.out.println("1-Ingresar Recibo Dependiente"
                    + "\n2-Ingresar Recibo Independiente"
                    + "\n3-Ingresar Recibo Ficto"
                    + "\n4-Borrar Recibo Dependiente"
                    + "\n5-Borrar Recibo Independiente"
                    + "\n6-Borrar Recibo Ficto"
                    + "\n7-Calculo Recibos Dependientes"
                    + "\n8-Calculo Recibos Independientes"
                    + "\n9-Calculo Recibos Fictos"
                    + "\n10-Total IRPF"
                    + "\n11-Salir");
            opcion = this.ingresarNroDosVal("\nPor favor ingrese una opción del menu: ", "ERROR, OPCIÓN INVALIDA", 1, 11);
            switch (opcion) {
                case 1:
                    System.out.println("-----------------------------------------------------------------------------------");
                    String nombreD = this.ingresarTexto("Ingrese el nombre del recibo dependiente: ");
                    nombreD.toUpperCase();
                    int sueldoD = this.ingresarNroUnVal("Ingrese valor del sueldo: ", "ERROR MONTO INVALIDO", 0);
                    int IRPFD = this.ingresarNroUnVal("Ingrese valor del IRPF: ", "ERROR MONTO INVALIDO", 0);
                    int montepioD = this.ingresarNroUnVal("Ingrese valor del montepio: ", "ERROR MONTO INVALIDO", 0);
                    int fonasa1D = this.ingresarNroUnVal("Ingrese valor del fonasa1: ", "ERROR MONTO INVALIDO", 0);
                    int fonasa2D = this.ingresarNroUnVal("Ingrese valor del fonasa2: ", "ERROR MONTO INVALIDO", 0);
                    int fonasa3D = this.ingresarNroUnVal("Ingrese valor del fonasa3: ", "ERROR MONTO INVALIDO", 0);
                    int fonasa4D = this.ingresarNroUnVal("Ingrese valor del fonasa4: ", "ERROR MONTO INVALIDO", 0);
                    int FRL = this.ingresarNroUnVal("Ingrese valor del FRL: ", "ERROR MONTO INVALIDO", 0);
                    this.getSistema().ingresarReciboDependiente(nombreD, sueldoD, IRPFD, montepioD, fonasa1D, fonasa2D, fonasa3D, fonasa4D, FRL);
                    System.out.println("-----------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------------------------");
                    String nombreI = this.ingresarTexto("Ingrese el nombre del recibo independiente: ");
                    nombreI.toUpperCase();
                    int sueldoI = this.ingresarNroUnVal("Ingrese valor del sueldo: ", "ERROR MONTO INVALIDO", 0);
                    int IRPFI = this.ingresarNroUnVal("Ingrese valor del IRPF:", "ERROR MONTO INVALIDO", 0);
                    int IVAI = this.ingresarNroUnVal("Ingrese valor del montepio: ", "ERROR MONTO INVALIDO", 0);
                    this.getSistema().ingresarReciboIndependiente(nombreI, sueldoI, IRPFI, IVAI);
                    System.out.println("-----------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------------------------------");
                    String nombreF = this.ingresarTexto("Ingrese el nombre del recibo ficto: ");
                    nombreF.toUpperCase();
                    int sueldoF = this.ingresarNroUnVal("Ingrese valor del sueldo: ", "ERROR MONTO INVALIDO", 0);
                    int IRPFF = this.ingresarNroUnVal("Ingrese valor del IRPF: ", "ERROR MONTO INVALIDO", 0);
                    this.getSistema().ingresarReciboFicto(nombreF, sueldoF, IRPFF);
                    System.out.println("-----------------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------------------------------");
                    if (this.getSistema().getListaRecibosDependientes().size() == 0) {
                        System.out.println("NO TIENE NINGUN RECIBO DEPENDIENTE EN EL SISTEMA");
                        System.out.println("VOLVIENDO AL MENÚ PRINCIPAL");
                    } else {
                        while (opcion != 1 && opcion != 2) {
                            System.out.println("1-Deseo borrar un Recibo Dependiente"
                                    + "\n2-Me equivoque y no deseo borrar Recibo Dependiente");
                            opcion = this.ingresarNroDosVal("\nPor favor ingrese una opción del menu: ", "ERROR, OPCIÓN INVALIDA", 1, 2);
                            switch (opcion) {
                                case 1:
                                    String buscadoBorroD = this.ingresarTexto("Ingrese el nombre del recibo dependiente que quiere borrar: ");
                                    buscadoBorroD.toUpperCase();
                                    for (int i = 0; i < this.getSistema().getListaRecibosDependientes().size(); i++) {
                                        ReciboDependiente unRD = this.getSistema().getListaRecibosDependientes().get(i);
                                        while (!unRD.getNombre().equals(buscadoBorroD)) {
                                            System.out.println("NO EXISTE UN RECIBO CON ESE NOMBRE");
                                            buscadoBorroD = this.ingresarTexto("Ingrese el nombre del recibo dependiente que quiere borrar: ");
                                            buscadoBorroD.toUpperCase();
                                        }
                                        this.getSistema().getListaRecibosDependientes().remove(i);
                                        System.out.println("RECIBO DEPENDIENTE BORRADO CON EXITO DEL SISTEMA");
                                        System.out.println("-----------------------------------------------------------------------------------");
                                        break;
                                    }
                                case 2:
                                    break;
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("-----------------------------------------------------------------------------------");
                    if (this.getSistema().getListaRecibosIndependientes().isEmpty()) {
                        System.out.println("NO TIENE NINGUN RECIBO INDEPENDIENTE EN EL SISTEMA");
                        System.out.println("VOLVIENDO AL MENÚ PRINCIPAL");
                    } else {
                        while (opcion != 1 && opcion != 2) {
                            System.out.println("1-Deseo borrar un Recibo Independiente"
                                    + "\n2-Me equivoque y no deseo borrar Recibo Independiente");
                            opcion = this.ingresarNroDosVal("\nPor favor ingrese una opción del menu: ", "ERROR, OPCIÓN INVALIDA", 1, 2);
                            switch (opcion) {
                                case 1:
                                    String buscadoBorroI = this.ingresarTexto("Ingrese el nombre del recibo independiente que quiere borrar: ");
                                    buscadoBorroI.toUpperCase();
                                    for (int i = 0; i < this.getSistema().getListaRecibosIndependientes().size(); i++) {
                                        ReciboIndependiente unRD = this.getSistema().getListaRecibosIndependientes().get(i);
                                        while (!unRD.getNombre().equals(buscadoBorroI)) {
                                            System.out.println("NO EXISTE UN RECIBO CON ESE NOMBRE");
                                            buscadoBorroI = this.ingresarTexto("Ingrese el nombre del recibo independiente que quiere borrar: ");
                                            buscadoBorroI.toUpperCase();
                                        }
                                        this.getSistema().getListaRecibosIndependientes().remove(i);
                                        System.out.println("RECIBO INDPENDIENTE BORRADO CON EXITO DEL SISTEMA");
                                        System.out.println("-----------------------------------------------------------------------------------");
                                        break;
                                    }
                                case 2:
                                    break;
                            }
                        }
                    }
                    break;

                case 6:
                    System.out.println("-----------------------------------------------------------------------------------");
                    if (this.getSistema().getListaRecibosFictos().isEmpty()) {
                        System.out.println("NO TIENE NINGUN RECIBO FICTO EN EL SISTEMA");
                        System.out.println("VOLVIENDO AL MENÚ PRINCIPAL");
                    } else {
                        while (opcion != 1 && opcion != 2) {
                            System.out.println("1-Deseo borrar un Recibo Ficto"
                                    + "\n2-Me equivoque y no deseo borrar Recibo Ficto");
                            opcion = this.ingresarNroDosVal("\nPor favor ingrese una opción del menu: ", "ERROR, OPCIÓN INVALIDA", 1, 2);
                            switch (opcion) {
                                case 1:
                                    String buscadoBorroF = this.ingresarTexto("Ingrese el nombre del recibo ficto que quiere borrar: ");
                                    buscadoBorroF.toUpperCase();
                                    for (int i = 0; i < this.getSistema().getListaRecibosFictos().size(); i++) {
                                        ReciboFicto unRD = this.getSistema().getListaRecibosFictos().get(i);
                                        while (!unRD.getNombre().equals(buscadoBorroF)) {
                                            System.out.println("NO EXISTE UN RECIBO CON ESE NOMBRE");
                                            buscadoBorroF = this.ingresarTexto("Ingrese el nombre del recibo ficto que quiere borrar: ");
                                            buscadoBorroF.toUpperCase();
                                        }
                                        this.getSistema().getListaRecibosFictos().remove(i);
                                        System.out.println("RECIBO FICTO BORRADO CON EXITO DEL SISTEMA");
                                        System.out.println("-----------------------------------------------------------------------------------");
                                        break;
                                    }
                                case 2:
                                    break;
                            }
                        }
                    }

                case 7:
                    System.out.println("-----------------------------------------------------------------------------------");
                    int SueldosDT = 0;
                    int IRPFDT = 0;
                    int montepioDT = 0;
                    int fonasaDT = 0;
                    int FRLDT = 0;
                    for (int i = 0; i < this.getSistema().getListaRecibosDependientes().size(); i++) {
                        ReciboDependiente unRD = this.getSistema().getListaRecibosDependientes().get(i);
                        SueldosDT = SueldosDT + unRD.getSueldo();
                        IRPFDT = IRPFDT + unRD.getIRPF();
                        montepioDT = montepioDT + unRD.getMontepio();
                        fonasaDT = fonasaDT + unRD.getFonasa1() + unRD.getFonasa2() + unRD.getFonasa3() + unRD.getFonasa4();
                        FRLDT = FRLDT + unRD.getFRL();
                    }
                    System.out.println("DATOS TOTALES RECIBOS DEPENDIENTES");
                    System.out.println("Sueldos: " + SueldosDT);
                    System.out.println("IRPF: " + IRPFDT);
                    System.out.println("Montepio: " + montepioDT);
                    System.out.println("Fonasa: " + fonasaDT);
                    System.out.println("FRL: " + FRLDT);
                    System.out.println("-----------------------------------------------------------------------------------");
                    break;
                case 8:
                    System.out.println("-----------------------------------------------------------------------------------");
                    int SueldosIT = 0;
                    int IRPFIT = 0;
                    int IVAIT = 0;
                    for (int i = 0; i < this.getSistema().getListaRecibosFictos().size(); i++) {
                        ReciboIndependiente unRI = this.getSistema().getListaRecibosIndependientes().get(i);
                        SueldosIT = SueldosIT + unRI.getSueldo();
                        IRPFIT = IRPFIT + unRI.getIRPF();
                        IVAIT = IVAIT + unRI.getIVA();
                    }
                    System.out.println("DATOS TOTALES RECIBOS INDEPENDIENTES");
                    System.out.println("Sueldos: " + SueldosIT);
                    System.out.println("IRPF: " + IRPFIT);
                    System.out.println("IVA: " + IVAIT);
                    System.out.println("TOTAL SUELDOS MENOS EL IVA: " + (SueldosIT - IVAIT));
                    System.out.println("-----------------------------------------------------------------------------------");
                    break;
                case 9:
                    System.out.println("-----------------------------------------------------------------------------------");
                    int SueldosFT = 0;
                    int IRPFFT = 0;
                    for (int i = 0; i < this.getSistema().getListaRecibosFictos().size(); i++) {
                        ReciboFicto unRF = this.getSistema().getListaRecibosFictos().get(i);
                        SueldosFT = SueldosFT + unRF.getSueldo();
                        IRPFFT = IRPFFT + unRF.getIRPF();
                    }
                    System.out.println("DATOS TOTALES RECIBOS FICTOS");
                    System.out.println("Sueldos: " + SueldosFT);
                    System.out.println("IRPF: " + IRPFFT);
                    System.out.println("-----------------------------------------------------------------------------------");
                    break;
                case 10:
                    System.out.println("-----------------------------------------------------------------------------------");
                    int sumaIRPFTotal = 0;
                    int ayuda1 = 0;
                    int ayuda2 = 0;
                    int ayuda3 = 0;
                    for (int i = 0; i < this.getSistema().getListaRecibosDependientes().size(); i++) {
                        ReciboDependiente unRD = this.getSistema().getListaRecibosDependientes().get(i);
                        ayuda1 = ayuda1 + unRD.getIRPF();
                    }
                    for (int i = 0; i < this.getSistema().getListaRecibosIndependientes().size(); i++) {
                        ReciboIndependiente unRI = this.getSistema().getListaRecibosIndependientes().get(i);
                        ayuda2 = ayuda2 + unRI.getIRPF();
                    }
                    for (int i = 0; i < this.getSistema().getListaRecibosFictos().size(); i++) {
                        ReciboFicto unRF = this.getSistema().getListaRecibosFictos().get(i);
                        ayuda3 = ayuda3 + unRF.getIRPF();
                    }
                    sumaIRPFTotal = ayuda1 + ayuda2 + ayuda3;
                    System.out.println(sumaIRPFTotal);
                    System.out.println("-----------------------------------------------------------------------------------");
                    break;
                case 11:
                    break;
            }
        }
    }
}
