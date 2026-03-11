package punto3.anemica;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Tempo tiempo = new Tempo();
        tiempo.setFechaHora(java.time.LocalDateTime.now());

        // La lógica de formateo está en el Main, no en el objeto Tiempo
        DateTimeFormatter largo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        DateTimeFormatter corto = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Formato Largo: " + tiempo.getFechaHora().format(largo));
        System.out.println("Formato Corto: " + tiempo.getFechaHora().format(corto));
    }
}