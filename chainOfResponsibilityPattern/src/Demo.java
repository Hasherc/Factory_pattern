package chainOfResponsibilityPattern.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-16
 * Time: 17:02
 */
public class Demo {
    private static AbstractLogger getChainOfLogger(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();
        loggerChain.logMessage(AbstractLogger.INFO, "This is a information");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a Debug level information");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is a Error level information");
    }
}
