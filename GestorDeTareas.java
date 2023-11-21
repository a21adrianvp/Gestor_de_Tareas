import java.util.ArrayList;

public class GestorDeTareas {

    public static void main(String[] args) {
        ArrayList<Tarea> listaTarea = new ArrayList<Tarea>();
        Tarea tarea1 = new Tarea("T1", 1, false, "Sacar la basura", "Izan");
        Tarea tarea2 = new Tarea("T2", 2, false, "Hacer la cama", "Alejandro");
        Tarea tarea3 = new Tarea("T3", 3, false, "Ir a clase", "Elena");
        listaTarea.add(tarea3);
        listaTarea.add(tarea2);
        listaTarea.add(tarea1);

        for (Tarea tarea : listaTarea) {
            System.out.println(tarea.nome);
        }

        
        listaTarea.remove(tarea3);
        for (Tarea tarea : listaTarea) {
            System.out.println(tarea.nome);
        }

        

    }

}