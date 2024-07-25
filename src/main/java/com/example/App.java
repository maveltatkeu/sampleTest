package com.example;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
    static Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String... args) {

        logger.info("Hello");
        display();
    }
    public static void display( ) {
        logger.info("  _____  _____");
        logger.info(" /     \\/     |");
        logger.info(" |  |\\    /|  | ");
        logger.info(" |  | \\__/ |  | ");
        logger.info(" |  |      |  | ");
        logger.info(" |__|      |__| ");

    }

}