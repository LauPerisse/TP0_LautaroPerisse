package punto3.noanemica;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(LocalDateTime.now());

        // El Main solo le pide al objeto que haga su trabajo ya que al no ser anemica lo sabe hacer
        System.out.println("Formato Largo: " + tiempo.getFormatoLargo());
        System.out.println("Formato Corto: " + tiempo.getFormatoCorto());
    }
}
