package punto3.noanemica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tiempo {
    private LocalDateTime fechaHora;

    public Tiempo(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getFormatoLargo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        return fechaHora.format(formatter);
    }

    public String getFormatoCorto() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaHora.format(formatter);
    }
}
