package be.intecbrussel;

import be.intecbrussel.method_references.TextPadder;
import be.intecbrussel.method_references.TextUtil;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class TextPrinterApp {
    public static void main(String[] args) {

        String repeat = "*".repeat(5);
        TextPrinter textPrinter =
                new TextPrinter("This is a sentence for testing purposes");
        TextPadder textPadder = new TextPadder(20);
        textPrinter.printProcessedWords(String::toUpperCase);

        TextPrinter textPrinter1 =
                new TextPrinter("6548 258 63 998 39");
        textPrinter1.printNumbersWithFunction(BigDecimal::new);

        Consumer<String> print = System.out::println;
        textPrinter
                .printFilteredWordsWithPredicateAndConsumer
                        (String::isEmpty,System.out::println);




    }
}
