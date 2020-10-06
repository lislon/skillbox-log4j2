import cafepoint.CaffePoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("Customer asked for coffee");
        CaffePoint.sellCoffee();

        logger.debug("Customer asked for one more coffee");
        CaffePoint.sellCoffee();
    }
}
