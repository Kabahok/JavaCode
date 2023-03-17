

public class Main {
    public static void main(String[] args) {

    SimpleLogger simpleLogger = new SimpleLogger();
    simpleLogger.log("Hello world");

    SmartLogger smartLogger = new SmartLogger();
    smartLogger.log("Java");
    smartLogger.log("error");
    smartLogger.log("operation error");

    }
}

