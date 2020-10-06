package cafepoint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import warehouse.CoffeeStorage;

public class CaffePoint {
    private static final Logger logger = LogManager.getLogger(CaffePoint.class);

    public static void sellCoffee() {
        CoffeeStorage.take();

        logger.info("Brew 1 coffee");
        System.out.println("Please enjoy your coffee!");
    }
}
