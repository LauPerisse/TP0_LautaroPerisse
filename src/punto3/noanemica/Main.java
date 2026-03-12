package punto3.noanemica;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(LocalDateTime.now());
        tiempo.imprimir();
    }
}
