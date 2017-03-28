package com.farouk.talatini;

import org.junit.Test;

/**
 * @author Farouk Talatini
 * @version 1.0
 */

public class StackTest {

    @Test
    /**
     * The purpose of this test is to make sure that exception of initializing a stack with
     * negative size will be correctly handled
     */
    public void negativeIntialStackSizeTest() {
        Stack stack = new Stack(-1);
    }

    @Test
    /**
     * The purpose of this test is to make sure that expanding size of stack is working properly
     */
    public void pushingElementsPastCapacityIntoStackTest() {
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push("A String element");
        stack.push("Another String element that will need the size to be expanded");
    }

    @Test
    /**
     * The purpose of this test is to verify that pulling an element for an empty stack will be handled properly
     */
    public void poppingAnElementFromAnEmptyStackTest() {
        Stack stack = new Stack(0);
        System.out.println(stack.pop());
    }
}
