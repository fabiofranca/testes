package teste.fabio.users.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<LocalDateTime> {


    public DateFormatter() {
        super();
    }
  
    @Override
    public LocalDateTime parse(String arg0, Locale arg1) throws java.text.ParseException {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", arg1);
    	return LocalDateTime.parse(arg0, formatter);
    }

    @Override
    public String print(LocalDateTime arg0, Locale arg1) {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", arg1);
        return formatter.format(arg0);
    }

}