package com.farouk.talatini

import groovy.util.logging.Slf4j

/**
 * @author      Farouk Talatini
 * @version     1.0
 */

@Slf4j
class ReplaceNeedleHayStackGroovy {

    static String ecalpeResrever(String haystack, String needle, String replacement) {

        log.info("Doing it all in one step, so groovy!")

        /**
         * In the groovy version,
         * I was able to do all the transformations
         * just in one step
         */

        String reversed = haystack.replace(needle,replacement).split().reverse().join(' ')

        return reversed
    }
    static void main( String[] args )
    {

        /**
         * Adding the asserts provided in the exercise
         *
         */

        assert ecalpeResrever("ABC", "A", "a").equals("aBC")

        assert ecalpeResrever("AAA AAB BAA", "AA", "a").equals("Ba aB aA")

        assert ecalpeResrever("I Work.", "Work", "Play").equals("Play. I")

        assert ecalpeResrever("Tests are the best!","the best!","just ok.").equals("ok. just are Tests");


    }
}
