package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int result = calc.calculate(10, 5, "add");
        LOGGER.log(Level.INFO, "Calculation result: {0}", result);

        UserService service = new UserService();

        try {
            service.findUser("admin");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Application error", e);
        }
    }
}
