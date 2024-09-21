import java.util.ArrayList;
import java.util.HashMap;

public class Ejemplo_HashMap {
    public static <prueba> void main(String[] args) {

        /*HashMap<String,Integer> edades=new HashMap<>();
        System.out.println(edades);

        edades.put("Maria",23); //Agregar Elemento clave-valor
        edades.put("Juan",15);
        edades.put("Pedro",21);
        System.out.println(edades);
        edades.put("Pedro",100);
        System.out.println(edades);
        System.out.println(edades.get("Juan"));
        if(edades.containsKey("Maria")) //Dice si contiene la clave
            System.out.println(edades.get("Maria"));
        else
            System.out.println("La clave no existe");

        edades.remove("Pedro");
        System.out.println(edades);

        for(String
        :edades.keySet()){
            System.out.println(edades.get(k));
        }*/

        //--------------------------------
       /* HashMap<Integer,Perro> perros=new HashMap<>();

        perros.put(1,new Perro("Labrador","Paco","Gris",3,1.2f,"Grande"));
        perros.put(2,new Perro("Siberiano","Atom","Blanco",5,0.8f,"Mediano"));
        perros.put(3,new Perro("Bulldog","Galilea","Cafe",8,0.4f,"Grande"));
        System.out.println(perros.get(2));

        ArrayList<String> prueba=new ArrayList<>();
        prueba.add("Prueba");
        prueba.add("Prueba");
        prueba.add("Prueba");
        prueba.add("Prueba");


        HashMap<Integer, ArrayList<String>> hassprueba=new HashMap<>();
        hassprueba.put(1,prueba);
        System.out.println(hassprueba);*/
        /*Perro p=new Perro("Bulldog","Princesa","Blanco",1,0.2f,"Pequeño");
        BD_Perros lista=new BD_Perros();
        lista.insertaPerro(4,p);
        System.out.println(lista.getDatos());*/
        Controlador cn=new Controlador();
        cn.control();

    }
}
