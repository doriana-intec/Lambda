package be.intecbrussel;

import java.util.Random;

@FunctionalInterface
public interface RandomMath {

    public int random(int a);

    public static void main(String[] args) {
        Random random1 = new Random();
        RandomMath randomMath = (a) -> random1.nextInt(a);

        System.out.println(randomMath.random(5));
    }

}
