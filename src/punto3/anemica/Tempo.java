package punto3.anemica;

import java.time.LocalDateTime;

public class Tempo {
    private LocalDateTime fechaHora;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
/*
¿Por que es anemica?
porque no sabe hacer nada, es un objeto pasivo
Si 10 partes diferentes necesitan imprimir la fecha en formato corto
habria que repetir la logica del formateador en los 10 lugares
alejandose de la programacion orientada a objetos
 */