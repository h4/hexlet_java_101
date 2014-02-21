import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world");

        // Initialize new variable, 32bit in Memory
        int age = 30;
        System.out.println(age);

        // Change value
        age = 12;
        System.out.println(age);

        // Increase value
        age = age + 1;
        System.out.println(age);

        age = age * 2;
        System.out.println(age);

        // Complex operation
        age = (age * 2) - age + 2;
        System.out.println(age);
    }
}
