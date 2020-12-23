package QueueAndStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        useDefaultQueue();

    }

    public static void useDefaultQueue(){
        Queue<Integer> queue = new LinkedList<>(); // 큐 객체 생성
        Stack<Integer> stack = new Stack<>(); // 스택 객체 생성

        for(int i = 0; i < 10; i++){ // 큐 & 스택에 원소 삽입
            queue.offer(i);
            stack.push(i);
        }

        System.out.println("원소가 삽입된 큐: " + queue);
        System.out.println("원소가 삽입된 스택: " + stack);
        System.out.println();

        System.out.print("큐의 출력 결과: [");
        for(int i = 0; i < 10; i++){
            System.out.print(queue.poll()+", ");
        }
        System.out.println("]");

        System.out.print("스택의 출력 결과: [");
        for(int i = 0; i < 10; i++){
            System.out.print(stack.pop()+", ");
        }
        System.out.println("]");
    }
}
