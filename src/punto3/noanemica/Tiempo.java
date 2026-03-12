package punto3.noanemica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tiempo {
    private final LocalDateTime fechaHora;

    public Tiempo(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void imprimir() {
        DateTimeFormatter largo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        DateTimeFormatter corto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Formato Largo: " + fechaHora.format(largo));
        System.out.println("Formato Corto: " + fechaHora.format(corto));
    }
}
