package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class TestStringLinkedList {
    static void main() {
        LinkedList<String> animalList = new LinkedList<>();
        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Lion");
        animalList.add("Horse");
        animalList.add("Tiger");

        System.out.println(animalList);

        LinkedList<String> removeAnimal  = new LinkedList<>(Arrays.asList("Cat","Lion"));
        animalList.removeAll(removeAnimal);
        System.out.println(animalList);

    }
}
