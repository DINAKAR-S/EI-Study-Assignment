package structural.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        ThirdPartyLogger thirdPartyLogger = new ThirdPartyLogger();
        Logger logger = new LoggerAdapter(thirdPartyLogger);

        logger.log("Adapter Pattern Example Log.");
    }
}
