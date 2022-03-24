import java.util.ArrayList;

public class Receta {
    private String nombre;
    private double tiempoPreparacion;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<String> pasos;

    public Receta(String nombre, double tiempoPreparacion, ArrayList<Ingrediente> ingredientes, ArrayList<String> pasos) {
        this.nombre = nombre;
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
        System.out.println("Receta creada");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(double tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    public void mostrarIngredietes(){
        for(Ingrediente ingrediente: ingredientes){
            System.out.println(ingrediente);
        }
        for(int i=0; i<ingredientes.size(); i ++){
            System.out.println( i +    " - " + ingredientes.get(i));
        }
    }

    public void mostrarPasos(){
        for (int i=0; i < pasos.size(); i++){
            System.out.println(i+1 + ". "+pasos.get(i));
        }
    }

    public void mostrarReceta(){
        System.out.println();
        System.out.println(tiempoPreparacion);
        mostrarIngredietes();
        mostrarPasos();
    }
}
