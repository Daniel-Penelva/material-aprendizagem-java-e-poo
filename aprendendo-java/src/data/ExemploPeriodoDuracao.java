package data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ExemploPeriodoDuracao {
    public static void main(String[] args) {
        
    	// Per�odo entre duas datas
        LocalDate dataInicio = LocalDate.of(2022, 1, 1);
        LocalDate dataFim = LocalDate.of(2022, 12, 31);
        Period periodo = Period.between(dataInicio, dataFim);
        System.out.println("Per�odo: " + periodo);

        // Dura��o entre duas horas
        LocalTime horaInicio = LocalTime.of(9, 0);
        LocalTime horaFim = LocalTime.of(17, 0);
        Duration duracao = Duration.between(horaInicio, horaFim);
        System.out.println("Dura��o: " + duracao);
    }
}
