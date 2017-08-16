package com.everis.alicante.courses.calculator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Sum operation.
 */
public class SubtractOperation extends AbstractOperationManager<Integer, Integer> {

    @Override
    protected String getOperationName() {
        return "SUM";
    }

    @Override
    protected Integer[] getOperators() {
        final List<Integer> result = new ArrayList<>();
        System.out.println("Insert operators until you add a zero");
        Integer newOperator;
        do {
            newOperator = super.getIn().nextInt();
            if (result.size() > 0) {
                newOperator = -newOperator;
            }
            result.add(newOperator);
        } while (newOperator != 0);
        return result.toArray(new Integer[result.size()]);
    }

    @Override
    protected Integer calculateResult(Integer[] objects) {
        return Arrays.stream(objects).mapToInt(Integer::intValue).sum();
    }
}
