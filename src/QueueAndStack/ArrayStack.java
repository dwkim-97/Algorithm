package QueueAndStack;

public class ArrayStack {
    int size;
    int top;
    int[] stack;

    public ArrayStack(int size){
        this.top = -1;
        this.size = size;
        this.stack = new int[this.size];
    }

    public int pop(){
        if(!this.empty()){
            int removeInt = this.stack[top];
            this.top -= 1;
            return removeInt;
        }
        else return -1;
    }

    public boolean push(int element){
        if(!this.full()){
            this.top += 1;
            this.stack[top] = element;
            return true;
        }
        else return false;
    }

    public int peek(){
        return this.stack[this.top];
    }

    public boolean empty(){
        return (this.top==-1);
    }

    public boolean full(){
        return ((this.top+1) == this.size);
    }
}
