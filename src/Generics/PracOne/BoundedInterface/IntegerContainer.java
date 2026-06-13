package Generics.PracOne.BoundedInterface;

public class IntegerContainer implements NumberContainer<Integer>{

    private Integer item;

    @Override
    public void add(Integer item) {
        this.item = item;

    }

    @Override
    public Integer get() {
        return item;
    }


    static void main() {
        NumberContainer<Integer> num = new IntegerContainer();
        num.add(123);
        System.out.println(num.get());
    }
}
