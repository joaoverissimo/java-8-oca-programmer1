package academy.learnprogramming.aula_100.main;

import academy.learnprogramming.aula_100.Dog;
import academy.learnprogramming.aula_100.Husky;

public class Main {

    public static void main(String[] args) {

        Husky husky = new Husky(5);
        husky.printDetails();

        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();
    }
}
