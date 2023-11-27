import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeTareas {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ArrayList<Tarea> listaTarea = new ArrayList<Tarea>();
        String caracter;
     

        do {
                System.out.println("escribe una letra para introducirte al siguiente menú");
                System.out.println("a) agregar tarea");
                System.out.println("b) listas tarea");
                System.out.println("c)eliminar tarea");
                System.out.println("d)salir menú");
                char letra = sca.next().charAt(0);
                caracter = String.valueOf(letra);
                
            switch (caracter) {

                case "a":
                    System.out.println("Escribe los datos de la tarea: titulo,identificador,descripcion,responsable.");
                    Tarea tarea = new Tarea();
                    System.out.println("Título: ");
                    sca.nextLine();
                    String titulo = sca.nextLine();
                    tarea.setNome(titulo);
                    System.out.println("Identificador: ");
                    int identificador = sca.nextInt();
                    tarea.setIdentificador(identificador);
                    System.out.println("Descripcion: ");
                    sca.nextLine();
                    String descripcion = sca.nextLine();
                    tarea.setDescripcion(descripcion);
                    System.out.println("Responsable: ");
                    String responsable = sca.nextLine();
                    tarea.setResponsable(responsable);
                    listaTarea.add(tarea);
                    break;

                case "b":
                for ( Tarea tarealista : listaTarea ) {
                    System.out.println("las tareas son :");
                    System.out.println(tarealista.identificador+" "+tarealista.nome);
                }
                    break;

                case "c":
                    System.out.println("Identificador: ");
                    int id = sca.nextInt();
                    for(int i=0; i<listaTarea.size(); i++){
                      if(listaTarea.get(i).identificador == id){
                        listaTarea.remove(listaTarea.get(i));
                      }
                    }
                        
                    break;
                case "d":
                    break;

            }
    

     }while(!caracter.equals("d"));
    }
}