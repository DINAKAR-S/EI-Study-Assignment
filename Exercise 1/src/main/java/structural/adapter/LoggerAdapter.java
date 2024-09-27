package structural.adapter;

public class LoggerAdapter implements Logger {
    private ThirdPartyLogger thirdPartyLogger;

    public LoggerAdapter(ThirdPartyLogger thirdPartyLogger) {
        this.thirdPartyLogger = thirdPartyLogger;
    }

    @Override
    public void log(String message) {
        thirdPartyLogger.writeLog(message);
    }
}
