import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Paciente paciente1 = new Paciente(
                1,
                "Ana Gomez",
                25,
                Arrays.asList("Penicilina"),
                "Sin antecedentes graves"
        );

        Medico medico1 = new Medico(
                1,
                "Carlos Perez",
                "Cardiologia"
        );

        CitaMedica cita1 = new CitaMedica(
                1,
                paciente1,
                medico1,
                LocalDateTime.of(2026, 3, 10, 10, 0)
        );

        cita1.agendarCita();

        Notificacion notificacion = new NotificacionCorreo();
        notificacion.enviarRecordatorio(cita1);
    }
}