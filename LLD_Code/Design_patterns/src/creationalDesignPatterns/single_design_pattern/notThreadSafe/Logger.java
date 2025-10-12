package creationalDesignPatterns.single_design_pattern.notThreadSafe;

public class Logger {
    private static Logger logger;
    public static Logger getLogger(){
        if (logger==null){
            logger=new Logger();
        }
        return logger;
    }
    public void run(){
        System.out.println("Application started...");
    }
}
