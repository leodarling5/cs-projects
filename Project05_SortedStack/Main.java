/**
 * Author: Leo Darling
 * Project 05 - Sorted Stack
 */

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }
        int temp = stack.pop();
        insertSorted(stack, value);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (scanner.hasNextInt()) {
            insertSorted(stack, scanner.nextInt());
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        scanner.close();
    }
}
