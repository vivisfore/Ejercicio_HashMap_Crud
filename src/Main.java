import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList - Clase
       /* ArrayList<String> lista=new ArrayList<>();
        ArrayList<Integer> precios=new ArrayList<>();

        lista.add("Manzana"); //Agregar elementos  a la lista
        lista.add("Kiwi");
        lista.add("Naranja");
        lista.add("Fresa");
        lista.add("Melon");
        System.out.println(lista);
        System.out.println(lista.get(3)); //Acceder a un elemento por posicion
        lista.set(1,"Piña"); //Modificar un elemneto de una posicion
        System.out.println(lista);
        lista.remove("Naranja"); //Elimina por elemento
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        int pos=lista.indexOf("Pera");
        System.out.println("Posicion: "+pos);
        if(pos>=0)
        System.out.println(lista.get(pos));
        else
            System.out.println("El elemnto no se encontro");

        for(String fruta:lista){
            System.out.println(fruta);
        }
*/
        //-----------------------------------------------------------------
        ArrayList<Perro> perros=new ArrayList<>();
        perros.add(new Perro("Labrador","Paco","Gris",3,1.2f,"Grande"));
        perros.add(new Perro("Siberiano","Atom","Blanco",5,0.8f,"Mediano"));
        perros.add(new Perro("Bulldog","Galilea","Cafe",8,0.4f,"Grande"));
        System.out.println(perros);
        double suma=0;
        for(Perro p:perros){
            System.out.println(p.getNombre());
            suma+=p.getEdad();
        }
        float promedio=(float)(suma/perros.size());
        System.out.println("Promedio de Edades: "+promedio);
    }
}