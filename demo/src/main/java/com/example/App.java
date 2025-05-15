package com.example;
import java.util.Arrays;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
         Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000);
        }

        System.out.println("Erembelhin umnu: " + Arrays.toString(arr));

         for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println( "Hello World!" );
        logger.info("Hello from Log4j!");
        logger.warn("Warning message");
        logger.error("Something went wrong!");
        logger.debug("Debugging information");
        logger.fatal("Fatal error occurred");
        logger.trace("Trace message");
    }
}
