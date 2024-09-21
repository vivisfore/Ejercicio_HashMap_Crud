import javax.swing.*;


public class Interfaz_Usuario {

    private String texto;
    private int entero;
    private float decimal;


    public String capturaTexto(String mensaje){
        texto= JOptionPane.showInputDialog(null,mensaje);
        return  texto;
    }

    public int capturaEntero(String mensaje){
        entero= Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
        return  entero;
    }

    public float capturaDecimal(String mensaje){
        decimal= Float.parseFloat(JOptionPane.showInputDialog(null,mensaje));
        return  decimal;
    }

    public void imprimir(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public int menu(){
        int opcion=0;
        while (opcion<1 || opcion>5){
            opcion= Integer.parseInt(JOptionPane.showInputDialog(null,"1. Registrar Perro." +
                    "\n2. Consultar por codigo.\n3. Mostrar lista.\n4. Eliminar Perro.\n5. Salir"));
        }

    return opcion;
    }
}
