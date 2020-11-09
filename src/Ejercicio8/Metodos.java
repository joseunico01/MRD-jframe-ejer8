package Ejercicio8;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Metodos {
    private int i;
    private Alumno alum;
    private List <Alumno>reg;
    private boolean band;

    public void ingresoDatos() {
        String codigo;
        reg=new ArrayList<Alumno>();
        reg = new ArrayList();
        i = 0;
        do {
            codigo=JOptionPane.showInputDialog("PRESIONE (x) SI YA NO DESEA ESCRIBIR OTRO CODIGO\n"
                    + (i + 1) + ". Digite un codigo: ");
            alum=new Alumno(codigo);
            reg.add(alum);
            i++;
        } while (!"x".equals(reg.get(i - 1).getCodigo()));
        reg.remove(i - 1);
    }
    public void busquedaCodigo(String u) {
        band = true;
        for (i = 0; i < reg.size(); i++) {
            if (reg.get(i).getCodigo().equals(u)) {
                band = false;
            }
        }
        if (band == true) {
            JOptionPane.showMessageDialog(null, "No existe el codigo en el registro");
        } else {
            JOptionPane.showMessageDialog(null, "El codigo si esta registrado");
        }
    }

    public void mostrarCodigos() {
        String cadena = "";
        for (i = 0; i < reg.size(); i++) {
            cadena +=reg.get(i).getCodigo() + "\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    public void finalizar(){
        JOptionPane.showMessageDialog(null,"\tGRACIAS POR USAR EL MENÚ");
      
    }
}
