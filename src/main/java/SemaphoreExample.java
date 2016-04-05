import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        SemaphoreExample.Card card      = new SemaphoreExample.Card();
        Semaphore             semaphore = new Semaphore(1);

        new Worker(semaphore, "Client", card, true).start();
        new Worker(semaphore, "Manager", card, false).start();
    }

    public static class Card {

        protected int count = 0;

        public void reduce()
        {
            this.count--;
        }

        public void add()
        {
            this.count++;
        }

        public int getCount()
        {
            return this.count;
        }

    }

    public static class Worker extends Thread {

        protected Semaphore             semaphore;
        protected String                name;
        protected SemaphoreExample.Card card;
        protected boolean workerType = false;

        public Worker(Semaphore semaphore, String name, Card card, boolean workerType)
        {
            this.semaphore = semaphore;
            this.name = name;
            this.card = card;
            this.workerType = workerType;
        }

        @Override
        public void run()
        {

            try {

                logger.info("%s started...%n", this.name);
                this.semaphore.acquire();
                logger.info("%s got access...%n", this.name);

                for (int i = 0; i < 10; i++) {
                    if (this.workerType) {
                        this.card.add();
                    } else {
                        this.card.reduce();
                    }
                    logger.info("%s was changed card to: %d%n", this.name, this.card.getCount());
                }

                this.semaphore.release();
                logger.info("%s was finished...%n", this.name);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
