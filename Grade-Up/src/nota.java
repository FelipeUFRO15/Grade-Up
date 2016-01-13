 public class nota {
    private double nota;
    private double porcentaje;
    private String descripcion;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public nota(double nota, double porcentaje, String descripcion) {
        this.nota = nota;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
    }
    
    
    
}

