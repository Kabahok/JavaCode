import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int cntLog = 0;
    private final String INFO_MSG = "INFO#%d [%s] %s\n";
    private final String ERROR_MSG = "ERROR#%d [%s] %s\n";

    @Override
    public void log(String msg) {
        ++cntLog;

        if (msg.toLowerCase().contains("error")) {
            System.out.format(ERROR_MSG, cntLog, LocalDateTime.now(), msg);
        } else {
            System.out.format(INFO_MSG, cntLog, LocalDateTime.now(), msg);
        }
    }
}
