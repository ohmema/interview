import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

class llogger {

    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args){
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, "My logger 1");
        logger.log(Level.SEVERE, "My logger 2");
        logger.log(Level.WARNING, "My logger 3");
        logger.log(Level.FINE, "My logger 4");
        logger.log(Level.FINER, "My logger 5");
        logger.log(Level.FINEST, "My logger 6");

        System.out.println();
    }
}
