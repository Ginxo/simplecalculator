package com.everis.alicante.courses.calculator;

import mingorance.enrique.commandlinemenu.Menu;
import mingorance.enrique.commandlinemenu.MenuBuilder;

/**
 * The type Calculator launcher.
 */
public class CalculatorLauncher {

    private final CalculatorManager calculatorManager = new CalculatorManager();

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String... args) {
        final CalculatorLauncher calculatorLauncher = new CalculatorLauncher();
        calculatorLauncher.launchCalculator();
    }

    /**
     * Launch calculator.
     */
    public void launchCalculator() {
        String menuResult;
        do {
            menuResult = this.buildMenu().play();
            OperationManager operation = calculatorManager.getOperation(menuResult);
            if (operation != null) {
                operation.playOperation();
            }
        } while (menuResult != null);
    }

    /**
     * Build menu menu.
     *
     * @return the menu
     */
    public Menu buildMenu() {
        return MenuBuilder.createMainMenu("Menu Principal")
                .addSimpleOption(1, "Sum")
                .addSimpleOption(2, "Subtract")
                .addSimpleOption(3, "Multiply")
                .addSimpleOption(4, "Divide")
                .addExitOption(0, "Exit")
                .build();

    }
}
