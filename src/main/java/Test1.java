import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test1 {

    static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        args = new String[]{"Java", "PHP", "Ruby"};

        logger.info("Print all args...");

        for (String argument : args) {
            logger.info("----");

            char[] chars = argument.toUpperCase().toCharArray();

            for (Character charItem : chars) {
                logger.info(charItem);
            }
        }

        logger.info("Finish!");

    }

}
