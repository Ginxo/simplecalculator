package com.everis.alicante.courses.calculator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Sum operation.
 */
public class MultiplyOperation extends AbstractOperationManager<Double, Double> {

    @Override
    protected String getOperationName() {
        return "SUM";
    }

    @Override
    protected Double[] getOperators() {
        final List<Double> result = new ArrayList<>();
        System.out.println("Insert operators until you add a zero");
        Double newOperator;
        do {
            newOperator = super.getIn().nextDouble();
            if (newOperator != 0) {
                result.add(newOperator);
            }
        } while (newOperator != 0);
        return result.toArray(new Double[result.size()]);
    }

    @Override
    protected Double calculateResult(Double[] objects) {
        return Arrays.stream(objects).reduce((a, b) -> a *= b).orElse(0d);
    }
}
