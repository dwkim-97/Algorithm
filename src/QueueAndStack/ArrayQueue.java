package QueueAndStack;

public class ArrayQueue {
    int size;
    int front;
    int count;
    int[] queue;

    public ArrayQueue(int size){
        this.size = size;
        this.queue = new int[this.size];
        this.front = 0;
    }

    public boolean offer(int element){
        if(!this.full()){
            this.count += 1;
            this.queue[this.count] = element;
            return true;
        }
        else return false;
    }

    public int peek(){
        if(!this.empty()){
            return this.queue[front];
        }
        else return -1;
    }

    public int poll(){
        if(!this.empty()){
            this.count -= 1;
            int removeInt = this.queue[this.front];
            this.front += 1;
            return removeInt;
        }
        else return -1;
    }


    public boolean empty(){
        return (this.front==size);
    }

    public boolean full(){
        return ((this.count+1) == this.size);
    }

}
