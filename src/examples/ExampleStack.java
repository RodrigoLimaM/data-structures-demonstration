package example;

import util.Stack;

public class ExampleStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //pushing
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        //popping
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}