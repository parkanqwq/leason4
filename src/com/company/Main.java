package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("---Задание 4.1---");
        long a = System.nanoTime();
        Stack<Cat> catStack = new Stack<>();
        catStack.push(new Cat("Mark"));
        catStack.push(new Cat("Jon"));
        catStack.push(new Cat("Bob"));
        catStack.peek().infoCat();
        while (!catStack.empty()){
            catStack.pop().infoCat();
        }
        System.out.println(catStack.empty());
        whatTime("Реализация простого стека и его базовых методов ", a);
        System.out.println();

        System.out.println("---Задание 4.2---");
        long b = System.nanoTime();
        Queue<Cat> queue = new LinkedList<>();
        queue.add(new Cat("Mark"));
        queue.add(new Cat("Jon"));
        queue.add(new Cat("Bob"));
        System.out.println(queue.size());
        while (!queue.isEmpty()){
            queue.poll().infoCat();
        }
        queue.add(new Cat("Bob"));
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        whatTime("Простая очередь и ее методы + вспомогательные ", b);
        System.out.println();

        System.out.println("---Задание 4.3---");
        long c = System.nanoTime();
        Deque<Cat> catDeque = new ArrayDeque<>();
        catDeque.add(new Cat("Mark"));
        catDeque.add(new Cat("Jon"));
        catDeque.add(new Cat("Bob"));
        catDeque.addFirst(new Cat("Firste"));
        catDeque.addLast(new Cat("Frontie"));
        catDeque.peekFirst().infoCat();
        catDeque.peekLast().infoCat();
        catDeque.pollFirst();
        catDeque.pollLast();
        while (!catDeque.isEmpty()){
            catDeque.poll().infoCat();
        }
        System.out.println(catDeque.size());
        whatTime("Тут реализация деков заняло ", c);
        System.out.println();

        System.out.println("---Задание 4.4---");
        long d = System.nanoTime();
        PriorityQueue<Integer> catPriorityQueue = new PriorityQueue<>();
        catPriorityQueue.add(2);
        catPriorityQueue.add(3);
        catPriorityQueue.add(5);
        whatTime("Приоритетная очередь заняло ", d);
        System.out.println();

        System.out.println("---Задание 4.5---");
        long f = System.nanoTime();
        LinkListStack linkListStack = new LinkListStack();
        linkListStack.push(25);
        linkListStack.push(100);
        linkListStack.push(125);
        linkListStack.displayStack();
        linkListStack.pop();
        linkListStack.displayStack();

        Queue<Cat> catQueue = new LinkedList<>();
        catQueue.add(new Cat("Sem"));
        whatTime("Стек и очередь на основе связанного списка заняло ", f);

    }

    private static void whatTime(String text, long time){
        System.out.println(text + (System.nanoTime() - time) + " Нано секунд");
    }

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        void displayNode() {
            System.out.print("["+data+"]");
        }
    }

    public static class LinkList {

        private Node first = null;

        void insertFirst(int data) {
            Node n = new Node(data);
            n.next = first;
            first = n;
        }

        Node deleteFirst() {
            Node temp = first;
            first = first.next;
            return temp;
        }

        void displayList() {
            Node current = first;
            while (current != null) {
                current.displayNode();
                current = current.next;
            }
        }

        boolean isEmpty() {
            return (first == null);
        }
    }

    public static class LinkListStack {

        LinkList li = new LinkList();

        public void push(int data) {
            li.insertFirst(data);
        }

        public void pop() {
            while(!li.isEmpty()){
                li.deleteFirst();
            }
        }

        public void displayStack() {
            System.out.println("  ");
            li.displayList();
        }
    }
}


