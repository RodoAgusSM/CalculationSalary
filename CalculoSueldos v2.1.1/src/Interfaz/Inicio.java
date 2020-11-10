package Interfaz;

import Dominio.Sistema;
import java.awt.Dimension;
import java.awt.Toolkit;

import Dominio.Sistema;

public class Inicio {

    public static void main(String[] args) {
        Sistema miSistema = new Sistema();
       // miSistema = miSistema.obtenerSistema();
        MenuPrincipal laInterfaz = new MenuPrincipal(miSistema);
        laInterfaz.setVisible(true);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = laInterfaz.getSize();
        laInterfaz.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
        laInterfaz.setVisible(true);
    }

}
