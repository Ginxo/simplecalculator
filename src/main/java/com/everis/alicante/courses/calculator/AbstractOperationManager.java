package com.everis.alicante.courses.calculator;

import java.util.Scanner;

/**
 * The type Abtract operation manager.
 *
 * @param <O> the type parameter
 * @param <R> the type parameter
 */
public abstract class AbstractOperationManager<O extends Object, R extends Object> implements OperationManager {

    private Scanner in = new Scanner(System.in);


    /**
     * Gets operation name.
     *
     * @return the operation name
     */
    abstract protected String getOperationName();

    /**
     * Get operators o [ ].
     *
     * @return the o [ ]
     */
    abstract O[] getOperators();

    /**
     * Calculate result r.
     *
     * @param objects the objects
     *
     * @return the r
     */
    abstract protected R calculateResult(O[] objects);

    public void playOperation() {
        System.out.println(String.format("******** Operation %s *************", this.getOperationName()));
        final R result = this.calculateResult(this.getOperators());
        System.out.println(String.format("The result of the operation %s is %s", this.getOperationName(), result));
    }

    /**
     * Get in scanner.
     *
     * @return the scanner
     */
    protected Scanner getIn() {
        if (this.in == null) {
            this.in = new Scanner(System.in);
        }
        return in;
    }

}
