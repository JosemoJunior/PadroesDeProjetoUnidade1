package singleton;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
	
    private static Logger instance;
    private static final String FILE_NAME = "log.txt";
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
    private Logger() {}

    // Synchronized para garantir que apenas um thread 
    // 		possa acessá-lo de cada vez
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
    	
    	String timestamp = LocalDateTime.now().format(DATE_FORMAT);
        String logMessage = String.format("%s - %s", timestamp, message);
    	
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(logMessage);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao gravar mensagem de log: " + e.getMessage());
        }
        System.out.println(logMessage);
    }
    
}