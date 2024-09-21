import javax.swing.*;
import java.util.HashMap;

public class Controlador {

    BD_Perros bd=new BD_Perros();
    Interfaz_Usuario vista= new Interfaz_Usuario();
    Perro p=new Perro();
    int codigo=0;

    public void control(){

        boolean veces=true;

        while (veces){
            int op=vista.menu();
            switch (op){
                case 1:
                    codigo=vista.capturaEntero("Ingrese el codigo.");
                    if(bd.existeCod(codigo)){
                        vista.imprimir("El Perro ya esta registrado.");
                    }else {
                        p.setNombre(vista.capturaTexto("Ingrese el nombre."));
                        p.setRaza(vista.capturaTexto("Ingrese la raza."));
                        p.setColor(vista.capturaTexto("Ingrese el color."));
                        p.setEdad(vista.capturaEntero("Ingrese la edad."));
                        p.setAltura(vista.capturaDecimal("Ingrese la altura."));
                        p.setTamanio(vista.capturaTexto("Ingrese el tamaño."));
                        bd.insertaPerro(codigo,p);
                        vista.imprimir("Registro exitoso.");
                        System.out.println(bd.mostrarPerros());
                        vista.imprimir(bd.mostrarPerros());
                    }
                    break;
                case 2:
                    codigo=vista.capturaEntero("Ingrese el codigo.");
                    if(bd.consultaCodigo(codigo)==null)
                       vista.imprimir("El Perro no esta registrado.");
                    else
                        System.out.println(bd.consultaCodigo(codigo));
                    break;
                case 3:
                    System.out.println(bd.mostrarPerros());
                    break;
                case 4:
                    codigo=vista.capturaEntero("Ingrese el codigo.");
                    vista.imprimir(bd.eliminarPerro(codigo));
                    break;
                case 5:
                    veces=false;
                    break;

            }

        }

    }
}
