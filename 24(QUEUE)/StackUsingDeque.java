import java.util.LinkedList;

import java.util.*;
public class StackUsingDeque {
    public class Satck{
        Deque<Integer> dq= new LinkedList<>();

        // method for push in stack
        public void push(int data){
            dq.addLast(data);
        }

        // method for pop in stack
        public int pop(){
            return dq.removeLast();
        }
        // method for peek in stack
        public int peek(){
            return dq.getLast();
        }

    }
    public static void main(String args[]){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek-"+s.peek());
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
