package warehouse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CoffeeStorage {
    private static final Logger logger = LogManager.getLogger(CoffeeStorage.class);
    private static int coffeeAmount = 10;

    public static void take() {
        if (coffeeAmount < 10) {
            logger.warn("Sir, our supplies are low! Please order more coffee");
        }

        if (coffeeAmount > 0) {
            coffeeAmount--;
            logger.debug("1 coffee was taken. Remaining: {}", coffeeAmount);
        } else {
            logger.error("No coffee left!");
        }
    }
}
