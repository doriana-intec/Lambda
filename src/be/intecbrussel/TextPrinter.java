package be.intecbrussel;

import be.intecbrussel.method_references.NumberParser;
import be.intecbrussel.method_references.WordProcessor;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter wordFilter) {
        for (String s : sentence.split(" ")) {
            if (wordFilter.isValid(s)){
                System.out.println(s);
            }
        }
    }

    public void printFilteredWordsWithPredicate(Predicate<String> predicate) {
        for (String s : sentence.split(" ")) {
            if (predicate.test(s)){
                System.out.println(s);
            }
        }
    }

     public void printProcessedWords(WordProcessor wordProcessor){
        for (String s : sentence.split(" ")){
            System.out.println(wordProcessor.process(s));
        }
     }

     public void printNumbers(NumberParser numberParser){
         for (String s : sentence.split(" ")){
             System.out.println(
                     String.format("%.2f%n",numberParser.parse(s)));
         }
     }

    public void printNumbersWithFunction(Function<String, BigDecimal> function){
        for (String s : sentence.split(" ")){
            System.out.println(
                    String.format("%.2f%n",function.apply(s)));
        }
    }

    public void printFilteredWordsWithPredicateAndConsumer
            (Predicate<String> predicate, Consumer<String> consumer) {
        for (String s : sentence.split(" ")) {
            if (predicate.test(s)){
                consumer.accept(s);
            }
        }
    }

}
