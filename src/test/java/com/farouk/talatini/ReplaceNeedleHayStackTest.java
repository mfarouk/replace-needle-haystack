package com.farouk.talatini;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author      Farouk Talatini
 * @version     1.0
 */

public class ReplaceNeedleHayStackTest {

    private static ReplaceNeedleHayStack replaceNeedleHayStack;

    @BeforeClass
    public static void init() {
        replaceNeedleHayStack = new ReplaceNeedleHayStack();
    }

    @Test
    public void ecalpeResreverTest() {
        assertTrue(replaceNeedleHayStack.ecalpeResrever("ABC", "A", "a").equals("aBC"));
        assertTrue(replaceNeedleHayStack.ecalpeResrever("AAA AAB BAA", "AA", "a").equals("Ba aB aA"));
        assertTrue(replaceNeedleHayStack.ecalpeResrever("I Work.", "Work", "Play").equals("Play. I"));
        assertTrue(replaceNeedleHayStack.ecalpeResrever("Tests are the best!", "the best!", "just ok.").equals("ok. just are Tests"));
    }
}
