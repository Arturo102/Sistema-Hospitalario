public class NotificacionCorreo implements Notificacion {

    private int horasAntes = 24;

    @Override
    public void enviarRecordatorio(CitaMedica cita) {

        System.out.println("Recordatorio enviado por correo.");
        System.out.println("La cita con el Dr. " + cita.getMedico().getNombre() +
                " es en " + cita.getFechaHoraInicio());
        System.out.println("Este recordatorio se envía " + horasAntes + " horas antes.");

    }
}