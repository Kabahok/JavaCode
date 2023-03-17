import java.time.LocalDateTime;

public class SimpleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.format("[%s] %s\n", LocalDateTime.now(), msg);
    }
}
