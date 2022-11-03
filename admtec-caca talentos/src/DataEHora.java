import java.time.LocalDate; // importa a classe LocalDate
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataEHora {
        public static void main(String[] args) {
            LocalDate data = LocalDate.now(); // Cria um objeto de data
            System.out.println(data); // Mostra a data atual
            LocalTime hora = LocalTime.now();
            System.out.println(hora);
            LocalDateTime dataEHora = LocalDateTime.now();
            System.out.println(dataEHora);
           
        }
}
