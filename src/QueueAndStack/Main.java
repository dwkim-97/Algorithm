package QueueAndStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        useQueue();
        useStack();

    }

    public static void useQueue(){
        System.out.println("<<< Queue >>>");
        Queue<Integer> queue = new LinkedList<>(); // 큐 객체 생성

        queue.offer(10); // offer: 큐에 10 삽입
        queue.offer(5); // offer: 큐에 5 삽입
        System.out.println("Queue : " + queue);
        // Queue : [10, 5]

        queue.add(25); // add: 큐에 25 삽입
        queue.add(99); // add: 큐에 99 삽입
        System.out.println("Queue : " + queue);
        // Queue : [10, 5, 25, 99]

        int peek = queue.peek(); // peek: 다음에 빼낼(맨 앞) 원소 '조회'
        System.out.println("peek : " + peek);
        // peek : 10

        System.out.println("Queue : " + queue);
        // Queue : [10, 5, 25, 99]

        int poll = queue.poll(); // poll: 맨 앞의 원소 '빼냄'
        System.out.println("poll : "+poll);
        // poll : 10

        System.out.println("Queue : " + queue);
        // Queue : [5, 25, 99]

        int remove = queue.remove(); // remove: 맨 앞의 원소 '빼냄'
        System.out.println("remove : "+remove);
        // remove : 5

        System.out.println("Queue : " + queue);
        // Queue : [25, 99]

        System.out.println();
    }

    public static void useStack(){
        System.out.println("<<< Stack >>>");

        Stack<Integer> stack = new Stack<>(); // 스택 객체 생성

        stack.push(1); // push: 스택에 1 삽입
        stack.push(9); // push: 스택에 9 삽입
        stack.push(13); // push: 스택에 13 삽입
        System.out.println("Stack : " + stack);
        // Stack : [1, 9, 13]

        int peek = stack.peek(); // peek: 다음에 빼낼(맨 뒤) 원소 '조회'
        System.out.println("peek : "+ peek);
        // peek : 13

        System.out.println("Stack : " + stack);
        // Stack : [1, 9, 13]

        int pop = stack.pop(); // pop: 맨 뒤의 원소 '빼냄'
        System.out.println("pop : " + pop);
        // pop : 13

        System.out.println("Stack : " + stack);
        // Stack : [1, 9]

        pop = stack.pop(); // pop: 맨 뒤의 원소 '빼냄'
        System.out.println("pop : " + pop);
        // pop : 9

        System.out.println("Stack : " + stack);
        // Stack : [1]
    }
}
