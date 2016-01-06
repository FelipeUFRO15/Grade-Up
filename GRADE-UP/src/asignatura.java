import java.util.ArrayList;

public class asignatura {
    private String nombreAsignatura;
    private ArrayList <nota> notas;
    private int horas;
    private double promedio;

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public ArrayList<nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<nota> notas) {
        this.notas = notas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public asignatura(String nombreAsignatura, int horas, double promedio) {
        this.nombreAsignatura = nombreAsignatura;
        notas = new ArrayList<nota>();
        this.horas = horas;
        this.promedio = promedio;
    }
    
    public double calcularPromedio(){
        for (int i = 0; i < getNotas().size(); i++) {
            promedio += getNotas().get(i).getNota() * getNotas().get(i).getPorcentaje();
        }
        return promedio;
    }
    public void ingresarNotas(String textField){
        getNotas().get(0).setNota(Double.parseDouble(textField));
    }
    public void calcularAprobacion(){
        //Pendiente
    }
    public void mostrarNotas(){
        
    }
    
}

