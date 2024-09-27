package structural.adapter;

public class ThirdPartyLogger {
    public void writeLog(String msg) {
        System.out.println("ThirdParty Log: " + msg);
    }
}
