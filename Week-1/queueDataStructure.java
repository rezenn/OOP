public class queueDataStructure {
    public static void main(String[] args) {
        
    }
}
class QueueData{
    int capacity;
    int front;
    int rear;
    int current_size;
    int[] queue_arr;
    QueueData(int capacity){
        this.capacity = capacity;
        front = 0;
        rear = -1;
        queue_arr = new int[this.capacity];
    }
    boolean isFull(){
        return this.current_size == this.capacity;
    }
    boolean isEmpty(){
        return current_size == 0;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return queue_arr[front];
    }
    void enqueue(int data){
        if(isFull()){
            System.out.println("Full");
        }else{
            rear ++;
            if(rear == capacity - 1){
                rear = 0;
            }
            queue_arr[rear] = data;
            current_size ++;
        }
    }
    int dequeue(){
    if(isEmpty()){
        System.out.println("Empty");
        return  -1;
    }else{
        front ++;
        current_size --;
        if(front == capacity -1){
            int ret = queue_arr[front - 1];
            front = 0;
            return ret;
        }else{
            return queue_arr[front-1];
        }
    }
    }
}
