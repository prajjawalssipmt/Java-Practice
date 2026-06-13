package Generics.PracOne.GenericInterface;

public class StringContainer implements Container<String> {

    String item;


    @Override
    public void add(String item) {
        this.item = item;

    }

    @Override
    public String get() {
        return item;
    }
}
