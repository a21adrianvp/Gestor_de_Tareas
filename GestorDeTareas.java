import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeTareas {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ArrayList<Tarea> listaTarea = new ArrayList<Tarea>();
        String caracter;

        do {
            System.out.println("Escribe una letra para introducirte al siguiente menú");
            System.out.println("a)Agregar tarea");
            System.out.println("b)Listas tarea");
            System.out.println("c)Eliminar tarea");
            System.out.println("d)Salir menú");
            System.out.println("e)Gestión de comentarios");
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
                    System.out.println("las tareas son :");
                    for (Tarea tarealista : listaTarea) {

                        System.out.println(tarealista.identificador + " " + tarealista.nome);
                    }
                    break;

                case "c":
                    System.out.println("Identificador: ");
                    int id = sca.nextInt();
                    for (int i = 0; i < listaTarea.size(); i++) {
                        if (listaTarea.get(i).identificador == id) {
                            listaTarea.remove(listaTarea.get(i));
                        }
                    }

                    break;
                case "d":
                    break;

                case "e":
                    System.out.println("Selecciona una letra para variar algun comentario:");
                    System.out.println("a)Agregar:");
                    System.out.println("b)Modificar:");
                    System.out.println("c)Eliminar:");
                    System.out.println("d)Visualizar:");

                    char letra2 = sca.next().charAt(0);
                    String caracter2 = String.valueOf(letra2);

                    switch (caracter2) {
                        case "a":
                            System.out.println("Indica su identificador:");
                            id = sca.nextInt();
                            for (int i = 0; i < listaTarea.size(); i++) {
                                if (listaTarea.get(i).identificador == id) {
                                    System.out.println("inserta el comentario que deseas agregar");
                                    sca.nextLine();
                                    String comentarios = sca.nextLine();
                                    listaTarea.get(i).setComentarios(comentarios);
                                    System.out.println("comentario agregado");
                                }
                            }
                            break;
                        case "b":
                            System.out.println("Indica su identificador:");
                            id = sca.nextInt();
                            for (int i = 0; i < listaTarea.size(); i++) {
                                if (listaTarea.get(i).identificador == id) {
                                    System.out.println("inserta el comentario que deseas modificar");
                                    sca.nextLine();
                                    String comentarios = sca.nextLine();
                                    listaTarea.get(i).setComentarios(comentarios);
                                    System.out.println("comentario modificado");
                                }
                            }
                            break;
                        case "c":
                            System.out.println("Indica su identificador:");
                            id = sca.nextInt();
                            for (int i = 0; i < listaTarea.size(); i++) {
                                if (listaTarea.get(i).identificador == id) {
                                    sca.nextLine();
                                    listaTarea.get(i).setComentarios("not comments");
                                    System.out.println("comentario eliminado");
                                }
                            }
                            break;
                        case "d":
                            System.out.println("Indica su identificador:");
                            id = sca.nextInt();
                            for (int i = 0; i < listaTarea.size(); i++) {
                                if (listaTarea.get(i).identificador == id) {
                                    System.out.println(listaTarea.get(i).getComentarios());
                                }
                            }
                            break;
                    }

            }

        } while (!caracter.equals("d"));

        sca.close();
    }
}