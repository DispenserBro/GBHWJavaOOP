package HW4;

import HW4.gb.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
//      Первое задание
        GBLinkedList<Integer> integers = new GBLinkedList<>(1);
//      С цепью вызовов добавлять удобнее, добавил ее только на add
        integers
                .add(2)
                .add(3)
                .add(4);
        integers.addFirst(5);
        integers.addLast(10);

        System.out.println(integers);
        integers.remove(3);
        System.out.println(integers);
        integers.removeFirst();
        System.out.println(integers);
        integers.removeLast();
        System.out.println(integers);


    }
}
