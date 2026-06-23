package Stack;

import java.util.Stack;

public class TestStack {
    static void main() {
        Stack<Stack<Integer>> mainStack = new Stack<>();

        Stack<Integer> subStack1 = new Stack<>();
        subStack1.push(1);
        subStack1.push(2);
        subStack1.push(3);
        subStack1.push(4);

        Stack<Integer> subStack2 = new Stack<>();
        subStack2.push(5);
        subStack2.push(6);
        subStack2.push(7);
        subStack2.push(8);

        mainStack.push(subStack1);
        mainStack.push(subStack2);

        System.out.println("Substack 1--> "+subStack1);
        System.out.println("Substack 2--> "+subStack2);
        System.out.println("Main Stack--> "+mainStack);

        while (!mainStack.isEmpty()){
//            System.out.println(mainStack.pop());
            Stack<Integer> currentStack = mainStack.pop();

            while (!currentStack.isEmpty()){
                System.out.println(currentStack.pop());
            }

        }

        System.out.println("Main Stack is empty--> "+mainStack.isEmpty());
    }
}
