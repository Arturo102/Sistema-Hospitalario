import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CitaMedica {

    private int id;
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime fechaHoraInicio;
    private int duracion = 30;

    private static List<CitaMedica> citas = new ArrayList<>();

    public CitaMedica(int id, Paciente paciente, Medico medico, LocalDateTime fechaHoraInicio) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public boolean verificarDisponibilidad() {

        for (CitaMedica cita : citas) {

            if (cita.medico.getId() == this.medico.getId() &&
                    cita.fechaHoraInicio.equals(this.fechaHoraInicio)) {

                return false;
            }
        }

        return true;
    }

    public void agendarCita() {

        if (verificarDisponibilidad()) {

            citas.add(this);

            System.out.println("Cita agendada correctamente.");
            System.out.println("Paciente: " + paciente.getNombreCompleto());
            System.out.println("Médico: " + medico.getNombre());
            System.out.println("Fecha: " + fechaHoraInicio);

        } else {

            System.out.println("El médico ya tiene una cita en ese horario.");

        }
    }

    public void cancelarCita() {

        citas.remove(this);
        System.out.println("Cita cancelada.");

    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }
}