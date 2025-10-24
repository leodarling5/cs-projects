/**
 * Author: Leo Darling
 * Project 04 - Sorted Linked List
 */

import java.util.LinkedList;
import java.util.Scanner;

public class SortedLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int index = 0;
            while (index < list.size() && list.get(index) < num) {
                index++;
            }
            list.add(index, num);
        }

        for (int number : list) {
            System.out.print(number + " ");
        }
        scanner.close();
    }
}
