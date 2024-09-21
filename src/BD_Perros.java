import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class BD_Perros {

    private HashMap<Integer,Perro> datos=new HashMap<>();

    public BD_Perros() {
        datos.put(1,new Perro("Labrador","Paco","Gris",3,1.2f,"Grande"));
        datos.put(2,new Perro("Siberiano","Atom","Blanco",5,0.8f,"Mediano"));
        datos.put(3,new Perro("Bulldog","Galilea","Cafe",8,0.4f,"Grande"));
    }

    public HashMap<Integer, Perro> getDatos() {
        return datos;
    }

    public boolean existeCod(int cod){
        if(datos.containsKey(cod))
            return true;
        else
            return  false;
    }

    public void insertaPerro(int clave, Perro p){
            datos.put(clave,p);
        }

    public String mostrarPerros(){
        String perros="";
        for(HashMap.Entry<Integer,Perro> cV: datos.entrySet()){
            perros+="-----------------------------" +
                    "\nClave: "+ cV.getKey()+
                    "\nNombre: "+cV.getValue().getNombre()+
                    "\nRaza: "+cV.getValue().getRaza()+
                    "\nColor: "+cV.getValue().getColor()+
                    "\nEdad: "+cV.getValue().getEdad()+
                    "\nAltura: "+cV.getValue().getAltura()+
                    "\nTamaño: "+cV.getValue().getTamanio()+"\n";
        }
        return perros;
    }

    public Perro consultaCodigo(int cod){
        Perro p=null;
        if(existeCod(cod))
            p=datos.get(cod);

        return p;
    }

    public String eliminarPerro(int codigo){
        if(existeCod(codigo)) {
            datos.remove(codigo);
            return "Mascota eliminada.";
        }
        else return "El perro no se encontro.";
        }


}
