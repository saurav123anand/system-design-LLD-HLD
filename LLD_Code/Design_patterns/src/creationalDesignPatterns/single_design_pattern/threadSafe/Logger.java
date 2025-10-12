package creationalDesignPatterns.single_design_pattern.threadSafe;

public class Logger {
    private static Logger logger;
    public static Logger getLogger(){
        if (logger==null){
            synchronized (Logger.class){
                if (logger==null) logger=new Logger();
            }
        }
        return logger;
    }
    public void run(){
        System.out.println("Application started...");
    }
}
