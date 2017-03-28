package com.farouk.talatini;

/* Removing unused import statement
 import java.util.*;
*/

/* Adding imports for added loggging
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author      Farouk Talatini
 * @version     1.0
 */

public class Stack {

    /**
     * Adding the logger to class
     */

    private final Logger logger = LoggerFactory.getLogger(Stack.class);

    private Object[] elements;

    private int size = 0;

    public Stack(int initialCapacity) {
        if (initialCapacity < 0) {
            /**
             * Defaulting capacity of negative capacity stack to zero
             */
            logger.debug("You entered a negative capaticy for the stack, setting capacity to zero");
            this.elements = new Object[size];
        } else {
            this.elements = new Object[initialCapacity];
        }
    }

    public void push(Object e) {
        ensureCapacity();
        logger.info("Pushing an element to the stack: " + e);
        elements[size++] = e;
    }

    public Object pop() {
        try {
            Object pop = elements[--size];
            //elements[size] = null;
            logger.info("Popping an element from the stack: " + pop);
            elements[size] = null;
            return pop;
        } catch (Exception ex) {
            logger.error("An exception has occured: " + ex);
            return "Unable to pop elemements from stack, it is unlikely empty, check error log for more details";
        }
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            Object[] oldElements = elements;
            logger.debug("About to increase the size of stack from {} to {}.", elements.length, elements.length + 1);
            /**
             * Adding only one element to the size of the stack instead of doubling the size
             */
            elements = new Object[elements.length + 1];
            System.arraycopy(oldElements, 0, elements, 0, size);
        }
    }
}