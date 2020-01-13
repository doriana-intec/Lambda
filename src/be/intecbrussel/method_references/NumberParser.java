package be.intecbrussel.method_references;

import java.math.BigDecimal;

@FunctionalInterface
public interface NumberParser {

    BigDecimal parse(String s);
}
