import java.util.ArrayList;

public class asignatura {
    private String nombreAsignatura;
    private ArrayList <nota> notas;
    private int horas;
    private double promedio;
    private double porcentajeasis;

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
    
    public double getPorcentajeasis() {
		return porcentajeasis;
	}

	public void setPorcentajeasis(double porcentajeasis) {
		this.porcentajeasis = porcentajeasis;
	}
    
    public asignatura(String nombreAsignatura, int horas, double porcentasis) {
        this.nombreAsignatura = nombreAsignatura;
        notas = new ArrayList<nota>();
        this.horas = horas;
        this.porcentajeasis = porcentasis;
    }
    
    public double calcularPromedio(){
        this.promedio = 0;
        double porcentaje = 0;
        for (int i = 0; i < notas.size(); i++) {
            porcentaje += notas.get(i).getPorcentaje();
        }
        if(porcentaje <= 100.0){
            for (int i = 0; i < getNotas().size(); i++) {
                this.promedio += notas.get(i).getNota() * (getNotas().get(i).getPorcentaje()) / 100;
            }
            return this.promedio;
        }else return -1;
    }
    public void ingresarNotas(String textField){
        getNotas().get(0).setNota(Double.parseDouble(textField));
    }
    public int calcularAprobacion(){
    	int aprob;
        return aprob= (int) (this.horas*(this.porcentajeasis/100));
    }

	
}

