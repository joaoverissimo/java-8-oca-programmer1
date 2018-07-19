package academy.learnprogramming.aula_103.main;

import academy.learnprogramming.aula_103.Dog;
import academy.learnprogramming.aula_103.Husky;

public class Main {

    public static void main(String[] args) {

        Husky husky = new Husky(5);
        husky.printDetails();

        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();

        husky.eat();
        System.out.println("avg= " + husky.getAverageWeight());
    }
}
