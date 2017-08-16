package com.everis.alicante.courses.calculator;

/**
 * The type Calculator manager.
 */
public class CalculatorManager {

    /**
     * Gets operation.
     *
     * @param menuOption the menu option
     *
     * @return the operation
     */
    public OperationManager getOperation(final String menuOption) {
        final OperationManager result;
        if (menuOption != null) {
            switch (menuOption) {
                case ".1":
                    result = new SumOperation();
                    break;
                case ".2":
                    result = new SubtractOperation();
                    break;
                case ".3":
                    result = new MultiplyOperation();
                    break;
                case ".4":
                    result = new DivideOperation();
                    break;
                default:
                    throw new RuntimeException();
            }
        } else {
            result = null;
        }
        return result;
    }
}
