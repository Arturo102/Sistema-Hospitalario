import java.util.List;

public class Paciente {

    private int id;
    private String nombreCompleto;
    private int edad;
    private List<String> alergias;
    private String historialClinico;

    public Paciente(int id, String nombreCompleto, int edad, List<String> alergias, String historialClinico) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.alergias = alergias;
        this.historialClinico = historialClinico;
    }

    public int getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public String getHistorialClinico() {
        return historialClinico;
    }
}