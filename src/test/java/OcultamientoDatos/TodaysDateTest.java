package OcultamientoDatos;
import OcultamientoDatos.TodaysDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class TodaysDateTest {

    private TodaysDate todaysDate;

    @BeforeEach
    void setUp() {
        todaysDate = new TodaysDate();
    }

    @Test
    void testTimeIsCurrentTime() {
        // Act
        todaysDate.printDateAndTime();

        // Obtener la hora actual
        LocalTime TiempoActual = LocalTime.now();

        // Convertir el time de TodaysDate a LocalTime
        String[] timeParts = todaysDate.time.split(":");
        LocalTime todaysDateTime = LocalTime.of(
                Integer.parseInt(timeParts[0]),
                Integer.parseInt(timeParts[1]),
                Integer.parseInt(timeParts[2])
        );

        // Assert - Verificar que la diferencia sea menor a 2 segundos
        long secondsDifference = ChronoUnit.SECONDS.between(
                todaysDateTime,
                TiempoActual
        );

        assertTrue(Math.abs(secondsDifference) < 2,
                "La diferencia de tiempo no debe ser mayor a 2 segundos. " +
                        "Tiempo de la clase: " + todaysDateTime +
                        ", Tiempo actual: " + TiempoActual);
    }

    @Test
    void testCompleteDateTime() {
        // Act
        todaysDate.printDateAndTime();

        // Obtener los componentes de la fecha y hora actual
        LocalTime now = LocalTime.now();

        // Verificar el formato del tiempo
        String[] timeParts = todaysDate.time.split(":");
        assertEquals(3, timeParts.length, "El formato de tiempo debe tener horas, minutos y segundos");

        // Convertir a números
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2]);

        // Assert
        assertTrue(hours >= 0 && hours < 24,
                "Las horas deben estar entre 0 y 23");
        assertTrue(minutes >= 0 && minutes < 60,
                "Los minutos deben estar entre 0 y 59");
        assertTrue(seconds >= 0 && seconds < 60,
                "Los segundos deben estar entre 0 y 59");

        // Verificar que la hora esté cerca de la hora actual
        assertTrue(Math.abs(hours - now.getHour()) <= 1,
                "La hora debe ser cercana a la hora actual");
    }
}