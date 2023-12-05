
public class Tarea {
    public String nome;
    public int identificador;
    public boolean completado = false;
    public String descripcion;
    public String responsable;
    public String comentarios;
    public String fechalimite;
    public String prioridad;

    public Tarea(String name, int id, boolean completed, String description, String resposible, String comment,String limitdate,String prioridad) {
        nome = name;
        identificador = id;
        completado = completed;
        descripcion = description;
        responsable = resposible;
        comentarios = comment;
        fechalimite = limitdate;
        this.prioridad=prioridad;
    }
    
    
    public Tarea(){

    }

    /* getters */
        public String getPrioridad() {
        return prioridad;
    }


    public String getNome() {
        return nome;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getResponsable() {
        return responsable;
    }

    public int getIdentificador() {
        return identificador;
    }

    public boolean getCompletado() {
        return completado;
    }
    
    public String getComentarios() {
        return comentarios;
    }
    
    public String getFechalimite() {
        return fechalimite;
    }
    

    /* setters */

    public void setNome(String name) {
        nome = name;
    }

    public void setDescripcion(String desc) {
        descripcion = desc;
    }

    public void setResponsable(String resp) {
        responsable = resp;
    }

    public void setIdentificador(int id) {
        identificador = id;
    }

    public void setCompletado(boolean comp) {
        completado = comp;
    }
        public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

     public void setComentarios(String comment) {
        comentarios = comment;
    }

    public void setFechalimite(String fechalimite) {
        this.fechalimite = fechalimite;
    }


    public void completarTarea(){
        
        if (completado==false) {
            completado=true;
        }
    }

    public void tareacompletada (){
        if(completado==true){
            System.out.println("esta completado");
        }else{
            System.out.println("no esta");
        }
        
    }
}

    

   
