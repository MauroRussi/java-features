package co.com.mrsoft.test.java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * Examples of new RandomGenerator interface.
 */
public class Example1 {
    public static void main(String[] args) {
        // Old-style random generator
        RandomGenerator legacyGenerator = RandomGeneratorFactory.of("Random").create();
        // Default random generator L32X64MixRandom
        RandomGenerator defaultGenerator = RandomGeneratorFactory.getDefault().create();
        // Specific random generator Xoshiro256PlusPlus
        RandomGenerator specificGenerator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(999);

        generate(legacyGenerator);
        generate(defaultGenerator);
        generate(specificGenerator);
    }

    private static void generate(RandomGenerator randomGenerator) {
        int counter = 0;

        System.out.println("RandomGenerator: " + randomGenerator.getClass());

        while(counter <= 10)
        {
            // Random numbers between 0 to 10
            int result = randomGenerator.nextInt(11);
            System.out.println(result);
            counter++;
        }
    }
}
