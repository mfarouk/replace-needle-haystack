package com.farouk.talatini;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author      Farouk Talatini
 * @version     1.0
 */

class ReplaceNeedleHayStack {

    /**
     * Result will be the returned reversed and replaced string.
     */
    private String result;

    private final Logger logger = LoggerFactory.getLogger(Stack.class);

    public String ecalpeResrever(String haystack, String needle, String replacement) {

        /**
         * Log what you are doing using SLF4J logger
         */

        logger.debug("replacing string {} with string {}.",needle,replacement);

        /**
         * Replace string needle with the provided replacement before diving into the reverse
         * if you reverse before replacement, the last testcase provided won't pass
         */

        String replaced = haystack.replace(needle, replacement);

        /**
         * Split the sentence into words
         */

        List<String> splitted = Arrays.asList(replaced.split("\\s"));

        /**
         * Reverse the splitted string
         */

        Collections.reverse(splitted);

        /**
         * Convert the reversed List to a string using StringBuilder
         */

        StringBuilder reversed = new StringBuilder();

        for (String each : splitted) {
            reversed.append(each);
            reversed.append(" ");
        }

        /**
         * Trim the string to get rid of any unwanted spaces at the beginning or end of the result sentence
         */

        result = reversed.toString().trim();

        logger.info("Reversed the sentence and returning new result: " + result);

        return result;
    }
}
